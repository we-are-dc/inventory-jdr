package project.inventoryjdr.characterClass;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Character {
    @PrimaryKey
    public long characterId;

    @ColumnInfo(name = "first_name")
    public String firstName;

    @ColumnInfo(name = "last_name")
    public String lastName;

    @ColumnInfo(name = "pods_max")
    public int podsMax;

    @ColumnInfo(name = "pods_current")
    public int podsCurrent;

    public Character(long characterId, String firstName, String lastName, int podsMax, int podsCurrent) {
        this.characterId = characterId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.podsMax = podsMax;
        this.podsCurrent = podsCurrent;
    }

    public long getCharacterId() {
        return characterId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPodsMax() {
        return podsMax;
    }

    public int getPodsCurrent() {
        return podsCurrent;
    }

    public void setCharacterId(long characterId) {
        this.characterId = characterId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPodsMax(int podsMax) {
        this.podsMax = podsMax;
    }

    public void setPodsCurrent(int podsCurrent) {
        this.podsCurrent = podsCurrent;
    }
}