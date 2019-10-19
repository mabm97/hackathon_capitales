package mx.tec.rest.service;

import mx.tec.rest.model.ReporteIrregularidad;
import java.util.List;

public interface IReporteIrregularidadService {
    List<ReporteIrregularidad> findReporteIrregularidads();
    ReporteIrregularidad findReporteIrregularidadById(int idReporteIrregularidad);
    boolean deleteReporteIrregularidad(int idReporteIrregularidad);
    boolean saveReporteIrregularidad(ReporteIrregularidad usuario);
    boolean editReporteIrregularidad(ReporteIrregularidad usuario);
}
