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
 * ContainerConfigsResDTO
 */
public class ContainerConfigsResDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host_network")
    
    
    private Boolean hostNetwork;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="container_port_list")
    
    
    private List<ContainerPortDTO> containerPortList = null;
    
    public ContainerConfigsResDTO withHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }

    


    /**
     * 是否使用主机网络模式
     * @return hostNetwork
     */
    public Boolean getHostNetwork() {
        return hostNetwork;
    }

    public void setHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
    }

    

    public ContainerConfigsResDTO withContainerPortList(List<ContainerPortDTO> containerPortList) {
        this.containerPortList = containerPortList;
        return this;
    }

    
    public ContainerConfigsResDTO addContainerPortListItem(ContainerPortDTO containerPortListItem) {
        if(this.containerPortList == null) {
            this.containerPortList = new ArrayList<>();
        }
        this.containerPortList.add(containerPortListItem);
        return this;
    }

    public ContainerConfigsResDTO withContainerPortList(Consumer<List<ContainerPortDTO>> containerPortListSetter) {
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
        ContainerConfigsResDTO containerConfigsResDTO = (ContainerConfigsResDTO) o;
        return Objects.equals(this.hostNetwork, containerConfigsResDTO.hostNetwork) &&
            Objects.equals(this.containerPortList, containerConfigsResDTO.containerPortList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(hostNetwork, containerPortList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerConfigsResDTO {\n");
        sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
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

