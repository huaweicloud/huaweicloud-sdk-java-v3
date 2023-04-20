package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.Position;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class CharacterConfig  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="character_id")
    

    private String characterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="position")
    

    private Position position;

    public CharacterConfig withCharacterId(String characterId) {
        this.characterId = characterId;
        return this;
    }

    


    /**
     * 形象id
     * @return characterId
     */
    public String getCharacterId() {
        return characterId;
    }

    public void setCharacterId(String characterId) {
        this.characterId = characterId;
    }

    

    public CharacterConfig withPosition(Position position) {
        this.position = position;
        return this;
    }

    public CharacterConfig withPosition(Consumer<Position> positionSetter) {
        if(this.position == null ){
            this.position = new Position();
            positionSetter.accept(this.position);
        }
        
        return this;
    }


    /**
     * Get position
     * @return position
     */
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterConfig characterConfig = (CharacterConfig) o;
        return Objects.equals(this.characterId, characterConfig.characterId) &&
            Objects.equals(this.position, characterConfig.position);
    }
    @Override
    public int hashCode() {
        return Objects.hash(characterId, position);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterConfig {\n");
        sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    
    
}

