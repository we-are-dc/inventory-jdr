package project.inventoryjdr.toolClass;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Tool{
    @PrimaryKey public long toolId;

    public long characterCreatorId;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "description")
    public String description;

    @ColumnInfo(name = "clutter")
    public int clutter;

    public Tool(long toolId, long characterCreatorId, String name, String description, int clutter) {
        this.toolId = toolId;
        this.characterCreatorId = characterCreatorId;
        this.name = name;
        this.description = description;
        this.clutter = clutter;
    }

    public long getToolId() {
        return toolId;
    }

    public long getCharacterCreatorId() {
        return characterCreatorId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getClutter() {
        return clutter;
    }

    public void setToolId(long toolId) {
        this.toolId = toolId;
    }

    public void setCharacterCreatorId(long characterCreatorId) {
        this.characterCreatorId = characterCreatorId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setClutter(int clutter) {
        this.clutter = clutter;
    }
}
