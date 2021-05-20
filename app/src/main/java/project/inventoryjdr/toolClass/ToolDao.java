package project.inventoryjdr.toolClass;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface ToolDao {
    @Query("SELECT * FROM tool")
    List<Tool> getAll();

    @Query("SELECT * FROM tool WHERE toolId IN (:toolIds)")
    List<Tool> loadAllByIds(int[] toolIds);

    @Query("SELECT * FROM tool WHERE toolId = :toolId")
    Tool loadById(int toolId);

    @Insert
    void insertAll(Tool... tools);

    @Delete
    void delete(Tool tool);
}
