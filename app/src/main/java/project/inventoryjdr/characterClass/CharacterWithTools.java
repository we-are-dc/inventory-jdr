package project.inventoryjdr.characterClass;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.room.Relation;
import java.util.List;
import project.inventoryjdr.toolClass.Tool;

@Entity
public class CharacterWithTools {
        @Ignore
        @PrimaryKey
        public long characterWithToolsId;

        @Embedded
        public Character character;
        @Relation(
                parentColumn = "characterWithToolsId",
                entityColumn = "characterCreatorId"
        )
        public List<Tool> tools;

        public CharacterWithTools(Character character, List<Tool> tools, long characterWithToolsId ) {
                this.character = character;
                this.tools = tools;
                this.characterWithToolsId = characterWithToolsId;
        }

        public Character getCharacter() {
                return character;
        }

        public long getCharacterWithToolsId() {
                return characterWithToolsId;
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

        public void setCharacterWithToolsId(long characterWithToolsId) {
                this.characterWithToolsId = characterWithToolsId;
        }
}
