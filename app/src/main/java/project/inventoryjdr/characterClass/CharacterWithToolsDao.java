package project.inventoryjdr.characterClass;

import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.Transaction;

import java.util.List;

@Dao
public interface CharacterWithToolsDao {
    @Transaction
    @Query("SELECT * FROM character")
    public List<CharacterWithTools> getCharactersWithTools();
}
