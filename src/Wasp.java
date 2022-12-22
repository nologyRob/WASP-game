public abstract class Wasp {    private int health;    private int id;    private String type;    public Wasp(int health, int id, String type) {        this.health = health;        this.id = id;        this.type = type;    }    public boolean waspIsDead(){        return this.getHealth() <= 0;    }    public void setHealth(int health) {        this.health = health;    }    public int getHealth() {        return health;    }    public int getId() {        return id;    }    public String getType() {        return type;    }    @Override    public String toString() {        return type + "Wasp{" + "health=" + health + ", id=" + id + '\'' + '}';    }}