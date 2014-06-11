package fr.utbm.dao.exception;

public class MapInUseException extends Exception {

    private final Integer id;
    private final String name;
    private final Integer building;
    
    public MapInUseException(Integer id, String name, Integer building) {
        this.id = id;
        this.name = name;
        this.building = building;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getBuilding() {
        return building;
    }
}
