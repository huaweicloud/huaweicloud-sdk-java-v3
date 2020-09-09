package com.huaweicloud.sdk.evs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UpdateVolumeOption
 */
public class UpdateVolumeOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;

    public UpdateVolumeOption withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 新的云硬盘的描述，name和description不能同时为null。最大支持255个字节。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateVolumeOption withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 新的云硬盘的名字，name和description不能同时为null。最大支持255个字节。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateVolumeOption updateVolumeOption = (UpdateVolumeOption) o;
        return Objects.equals(this.description, updateVolumeOption.description) &&
            Objects.equals(this.name, updateVolumeOption.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(description, name);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVolumeOption {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

