# Taller final - sistema de transporte

---

### ¿Cómo correr el proyecto?
> 1. Posterior a clonar este repositorio en su ordenador, presionar clic derecho en el archivo "ConsultorioMedicoApplication".
> 2. Presionar la opción Run.

### Desarrollo del proyecto
> 1. Identificar los requerimientos: El objetivo es crear una clase Agenda de citas para un consultorio médico. La clase debe permitir agendar citas para pacientes y verificar la disponibilidad de horarios.
> 2. Crear una clase Paciente: Esta clase debe tener atributos como nombre, apellido, identificación, y fecha de nacimiento. También puedes agregar métodos para obtener y establecer estos valores
> 3. Crear una clase Cita: Esta clase debe tener atributos como fecha, hora inicio y hora fin, paciente y un id único. También puedes agregar métodos para obtener y establecer estos valores.
> 4. Crear una clase Horario: Esta clase debe tener atributos como fecha, hora inicio, hora fin y una lista de citas. También puedes agregar métodos para verificar si un horario está disponible y para ocupar un horario.
> 5. Crear una clase AgendaCitas: Esta clase debe tener un atributo Map<String, Horario> horarioDisponible y un método para agendar citas que reciba como parámetro un objeto de la clase Cita.
> 6. Probar la clase AgendaCitas: Crea objetos de la clase Paciente, Cita y Horario, y utiliza el método de agendar citas de la clase AgendaCitas para verificar que todo funciona correctamente.


### Estructura de las carpetas
> - clases: Clases abstractas o plantillas para la creación de clases complejas.
> - controller: Controladores para recibir peticiones del api.
> - interfaces: Interfaces contienen los métodos abstractos, estos comportamientos son aplicados solo por las clases que implementen la interface.
> - model: Modelos o representación de los tipos de datos de la api.
> - repository: Clases para la manipulación de los datos y la lógica de negocio.

## Documentación de la API

---

### Establecer un horario de disponibilidad por día de la semana.
| Url | Método | 
|----|----|
| `/api/api/horario/asignar` | `post` |

Tipo (Destino)
```json
{
  "nombreDestino": "String",
  "departamento": "String",
  "ciudad": "String"
}
```

### Listar destino
| Url | Método | 
|----|----|
| `/api/destino/listar` | `get` |

---

### Registrar bus
| Url | Método | 
|----|----|
| `/api/bus/guardar` | `post` |

Tipo (Vehiculo)
```json
{
  "placa": "String",
  "tipo": "String"
}
```

### Listar buses
| Url | Método | 
|----|----|
| `/api/bus/listar` | `get` |

---

### Asignar un conductor al bus
| Url | Método | 
|----|----|
| `/api/bus/asignar/{placa}` | `put` |

Tipo (Vehiculo)
```json
{
  "nombre": "String",
  "apellido": "String",
  "cedula": "String",
  "telefono": int,
  "numeroLicencia": "String"
}
```

---

### Registrar viaje
| Url | Método | 
|----|----|
| `/api/viaje/guardar/{idDestino}/{idBus}` | `post` |

Tipo (Viaje)
```json
{
  "hora": "String"
}
```

### Listar viaje
| Url | Método | 
|----|----|
| `/api/viaje/listar` | `get` |

---

### Ingresar pasajeros al bus
| Url | Método | 
|----|----|
| `/api/viaje/ingresar-pasajero/{idViaje}` | `post` |

Tipo (Viaje)

```json
{
  "nombre": "String",
  "apellido": "String",
  "cedula": "String",
  "telefono": int,
  "numeroMaletas": int
}
```

---

## Patrones de diseño aplicados

- Singleton: Se aplicó en la clase "TerminalTransporteRepository", con el fin de que no se crearan muchas terminales de transporte sino solo una.
- Factory Method: Se aplicó por medio de la creación de las interfaces "IRepository" y "IVehiculo".
