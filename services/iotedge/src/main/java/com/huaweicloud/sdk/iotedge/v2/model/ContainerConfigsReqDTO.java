package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.ContainerPortDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ContainerConfigsReqDTO
 */
public class ContainerConfigsReqDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="container_port_list")
    
    
    private List<ContainerPortDTO> containerPortList = null;
    
    public ContainerConfigsReqDTO withContainerPortList(List<ContainerPortDTO> containerPortList) {
        this.containerPortList = containerPortList;
        return this;
    }

    
    public ContainerConfigsReqDTO addContainerPortListItem(ContainerPortDTO containerPortListItem) {
        if(this.containerPortList == null) {
            this.containerPortList = new ArrayList<>();
        }
        this.containerPortList.add(containerPortListItem);
        return this;
    }

    public ContainerConfigsReqDTO withContainerPortList(Consumer<List<ContainerPortDTO>> containerPortListSetter) {
        if(this.containerPortList == null) {
            this.containerPortList = new ArrayList<>();
        }
        containerPortListSetter.accept(this.containerPortList);
        return this;
    }

    /**
     * 容器端口映射值
     * @return containerPortList
     */
    public List<ContainerPortDTO> getContainerPortList() {
        return containerPortList;
    }

    public void setContainerPortList(List<ContainerPortDTO> containerPortList) {
        this.containerPortList = containerPortList;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContainerConfigsReqDTO containerConfigsReqDTO = (ContainerConfigsReqDTO) o;
        return Objects.equals(this.containerPortList, containerConfigsReqDTO.containerPortList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(containerPortList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerConfigsReqDTO {\n");
        sb.append("    containerPortList: ").append(toIndentedString(containerPortList)).append("\n");
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

