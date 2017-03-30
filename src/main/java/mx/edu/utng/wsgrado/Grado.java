package mx.edu.utng.wsgrado;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

import java.util.Hashtable;

/**
 * Created by Alumno on 30/03/2017.
 */

public class Grado implements KvmSerializable {
    private int id;
    private String descrpcion;
    private String activo;

    public Grado(int id, String descrpcion, String activo) {
        this.id = id;
        this.descrpcion = descrpcion;
        this.activo = activo;
    }

    public Grado() {
        this(0,"","");
    }

    @Override
    public Object getProperty(int i) {
        switch (i) {
            case 0:
                return id;
            case 1:
                return descrpcion;
            case 2:
                return activo;
        }

        return  null;
    }

    @Override
    public int getPropertyCount() {
        return 3;
    }

    @Override
    public void setProperty(int i, Object o) {
        switch (i){
            case 0:
                id =Integer.parseInt(o.toString());
                break;
            case 1:
                descrpcion = o.toString();
                break;
            case 2:
                activo = o.toString();
                break;
            default:
                break;
        }
    }

    @Override
    public void getPropertyInfo(int i, Hashtable hashtable, PropertyInfo propertyInfo) {
        switch (i) {
            case 0:
                propertyInfo.type = PropertyInfo.INTEGER_CLASS;
                propertyInfo.name = "id";
                break;
            case 1:
                propertyInfo.type = PropertyInfo.STRING_CLASS;
                propertyInfo.name = "descripcion";
                break;
            case 2:
                propertyInfo.type = PropertyInfo.STRING_CLASS;
                propertyInfo.name = "activo";
                break;
            default:
                break;
        }


    }


}
