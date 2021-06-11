package project.inventoryjdr.characterClass;

import androidx.room.Embedded;
import androidx.room.PrimaryKey;
import androidx.room.Relation;
import java.util.List;
import project.inventoryjdr.toolClass.Tool;


public class CharacterWithTools {
        @Embedded
        public Character character;
        @Relation(
                parentColumn = "characterId",
                entityColumn = "characterCreatorId"
        )
        public List<Tool> tools;

        public CharacterWithTools(Character character, List<Tool> tools) {
                this.character = character;
                this.tools = tools;
        }

        public Character getCharacter() {
                return character;
        }

        public List<Tool> getTools() {
                return tools;
        }

        public void setCharacter(Character character) {
                this.character = character;
        }

        public void setTools(List<Tool> tools) {
                this.tools = tools;
        }
}
