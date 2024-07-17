package br.ufg.poo.g8;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.Dao;
import java.sql.SQLException;
import com.j256.ormlite.table.TableUtils;
import java.util.List;
import java.util.ArrayList;

/**
 * Escreva uma descrição da classe sdxcsaf aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */


public class QuadroPacientesRepository
{
    private static Database database;
    private static Dao<Paciente, Integer> dao;
    private List<Paciente> loadedStudents;
    private Paciente loadedStudent; 
    
    public QuadroPacientesRepository(Database database) {
        QuadroPacientesRepository.setDatabase(database);
        loadedStudents = new ArrayList<Paciente>();
    }
    
    public static void setDatabase(Database database) {
        QuadroPacientesRepository.database = database;
        try {
            dao = DaoManager.createDao(database.getConnection(), Paciente.class);
            TableUtils.createTableIfNotExists(database.getConnection(), Paciente.class);
        }
        catch(SQLException e) {
            System.out.println(e);
        }            
    }
    
    public Paciente create(Paciente paciente) {
        int nrows = 0;
        try {
            nrows = dao.create(paciente);
            if ( nrows == 0 )
                throw new SQLException("Error: object not saved");
            this.loadedStudent = paciente;
            loadedStudents.add(paciente);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return paciente;
    }    

    public void update(Paciente paciente) {
      // TODO
    }

    public void delete(Paciente paciente) {
      // TODO
    }
    
    public Paciente loadFromId(int id) {
        try {
            this.loadedStudent = dao.queryForId(id);
            if (this.loadedStudent != null)
                this.loadedStudents.add(this.loadedStudent);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return this.loadedStudent;
    }    
    
    public List<Paciente> loadAll() {
        try {
            this.loadedStudents =  dao.queryForAll();
            if (this.loadedStudents.size() != 0)
                this.loadedStudent = this.loadedStudents.get(0);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return this.loadedStudents;
    }

    // getters and setters ommited...        
}