package mx.tec.rest.service;

import mx.tec.rest.model.CTipoIrregularidad;
import mx.tec.rest.model.Usuario;

import java.util.List;

public interface ITipoIrregularidadService {
    List<CTipoIrregularidad> findCTipoIrregularidads();
    CTipoIrregularidad findTipoIrregularidadById(int idTipoIrregularidad);
    boolean deleteTipoIrregularidad(int idTipoIrregularidad);
    boolean saveTipoIrregularidad(CTipoIrregularidad tipoIrregularidad);
    boolean editTipoIrregularidad(CTipoIrregularidad tipoIrregularidad);
}
