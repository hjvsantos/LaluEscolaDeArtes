package negocios;

import java.io.IOException;

import org.json.JSONException;

import classesBasicas.Horario;
import data.IRepositorioHorario;
import data.RepositorioHorario;

public class CadastroHorario {
	private IRepositorioHorario ra = new RepositorioHorario();
	
	public void insert(Horario horario) throws JSONException, IOException{
		ra.insert(horario);
	}
	
	public void update(Horario horario) throws JSONException, IOException{
		ra.update(horario);
	}
	
	public void delete(int id) throws JSONException, IOException{
		ra.delete(id);
	}
}
