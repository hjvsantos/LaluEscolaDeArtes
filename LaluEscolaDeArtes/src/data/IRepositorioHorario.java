package data;
import java.io.IOException;
import java.util.List;

import org.json.JSONException;

import classesBasicas.Horario;

public interface IRepositorioHorario {
	public void insert(Horario horario) throws JSONException, IOException;
	public void update(Horario horario) throws JSONException, IOException;
	public void delete(int hora) throws JSONException, IOException;
}
