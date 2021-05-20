package project.inventoryjdr;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import project.inventoryjdr.characterClass.CharacterDao;
import project.inventoryjdr.characterClass.CharacterWithTools;
import project.inventoryjdr.characterClass.CharacterWithToolsDao;
import project.inventoryjdr.toolClass.Tool;
import project.inventoryjdr.characterClass.Character;
import project.inventoryjdr.toolClass.ToolDao;

@Database(entities = {
        Character.class
}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract CharacterDao characterDao();
    public abstract CharacterWithToolsDao characterWithToolsDao();
    public abstract ToolDao toolDao();
}
