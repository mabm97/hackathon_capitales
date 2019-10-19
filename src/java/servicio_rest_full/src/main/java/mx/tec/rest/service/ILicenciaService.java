package mx.tec.rest.service;

import mx.tec.rest.model.Licencia;

import java.util.List;

public interface ILicenciaService {
    List<Licencia> findLicencias();
    Licencia findLicenciaById(int idLicencia);
    boolean deleteLicencia(int idLicencia);
    boolean saveLicencia(Licencia licencia);
    boolean editLicencia(Licencia licencia);
}
