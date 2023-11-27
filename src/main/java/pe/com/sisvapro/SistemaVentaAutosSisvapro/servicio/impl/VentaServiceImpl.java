package pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.dto.VentaTransactionDto;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Carro;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.DetalleVenta;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.entity.Venta;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.repositorio.ICarroRepository;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.repositorio.IDetalleVentaRepository;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.repositorio.IVentaRepository;
import pe.com.sisvapro.SistemaVentaAutosSisvapro.servicio.VentaService;

import java.util.List;

@Service
@AllArgsConstructor
public class VentaServiceImpl implements VentaService {

    private IVentaRepository repoVenta;
    private IDetalleVentaRepository repoDetalle;
    private ICarroRepository repoCarro;

    @Override
    public List<Venta> listarVentas() {
        return repoVenta.findAll();
    }

    @Override
    public Venta obtenerVenta(int id) {
        return repoVenta.findById(id).orElse(null);
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public Venta agregarVenta(VentaTransactionDto venta) throws Exception {
        System.out.println("En service");
        Venta ventaEntity = repoVenta.save(venta.getVenta());
        for (DetalleVenta detalle: venta.getDetalleVenta()){
            Carro carro = repoCarro.findById(detalle.getCarro().getId()).orElse(null);
            carro.setStock(carro.getStock() - detalle.getCantidad());
            if (carro.getStock() < 0){
                throw new Exception();
            }
            detalle.setVenta(ventaEntity);
            repoDetalle.save(detalle);
            repoCarro.save(carro);
        }
        return ventaEntity;
    }

    @Override
    public Venta actualizarVenta(Venta venta) {
        Venta ventaFinded = repoVenta.findById(venta.getId()).orElse(null);
        if (ventaFinded != null){
            ventaFinded.setMonto(venta.getMonto());
            ventaFinded.setFecha((venta.getFecha()));
            ventaFinded.setNumserie(venta.getNumserie());
            ventaFinded.setCliente(venta.getCliente());
            ventaFinded.setEmpleado(venta.getEmpleado());
            repoVenta.save(ventaFinded);
        }
        return ventaFinded;
    }

    @Override
    public void eliminarVenta(int id) {
        repoVenta.deleteById(id);
    }

    @Override
    public Venta obtenerUltimaVenta() {
        return repoVenta.findFirstByOrderByIdDesc().orElse(null);
    }
}
