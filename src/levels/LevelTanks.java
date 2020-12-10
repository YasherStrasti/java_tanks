package levels;

import java.util.Objects;

public class LevelTanks {
    private int level;
    private String name;
    private boolean active;

    public LevelTanks(int level, String name, boolean active) {
        this.level = level;
        this.name = name;
        this.active = active;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LevelTanks that = (LevelTanks) o;
        return getLevel() == that.getLevel() && active == that.active && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLevel(), name, active);
    }
}