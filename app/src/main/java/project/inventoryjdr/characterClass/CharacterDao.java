package project.inventoryjdr.characterClass;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface CharacterDao {
    @Query("SELECT * FROM Character")
    List<Character> getAll();

   /* @Query("SELECT * FROM character WHERE characterId IN (:characterIds)")
    List<Character> loadAllByIds(int[] characterIds);

    @Query("SELECT * FROM character WHERE first_name LIKE :first AND " +
            "last_name LIKE :last LIMIT 1")
    Character findByName(String first, String last); */

    @Insert
    void insertAll(Character... characters);

    @Delete
    void delete(Character character);
}
