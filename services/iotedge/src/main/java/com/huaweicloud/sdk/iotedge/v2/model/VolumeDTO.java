package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * VolumeDTO
 */
public class VolumeDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    @JacksonXmlProperty(localName = "name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    @JacksonXmlProperty(localName = "type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source")
    
    @JacksonXmlProperty(localName = "source")
    
    private String source;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="destination")
    
    @JacksonXmlProperty(localName = "destination")
    
    private String destination;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="read_only")
    
    @JacksonXmlProperty(localName = "read_only")
    
    private Boolean readOnly;

    public VolumeDTO withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 卷名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public VolumeDTO withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 挂载类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public VolumeDTO withSource(String source) {
        this.source = source;
        return this;
    }

    


    /**
     * 源路径
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    

    public VolumeDTO withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    


    /**
     * 卷挂载路径
     * @return destination
     */
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    

    public VolumeDTO withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    


    /**
     * 只读，默认只读
     * @return readOnly
     */
    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VolumeDTO volumeDTO = (VolumeDTO) o;
        return Objects.equals(this.name, volumeDTO.name) &&
            Objects.equals(this.type, volumeDTO.type) &&
            Objects.equals(this.source, volumeDTO.source) &&
            Objects.equals(this.destination, volumeDTO.destination) &&
            Objects.equals(this.readOnly, volumeDTO.readOnly);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, type, source, destination, readOnly);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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

