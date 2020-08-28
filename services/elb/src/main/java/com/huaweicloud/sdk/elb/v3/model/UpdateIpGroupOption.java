package com.huaweicloud.sdk.elb.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.UpadateIpGroupIpOption;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class UpdateIpGroupOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_list")
    
    private List<UpadateIpGroupIpOption> ipList = null;
    
    public UpdateIpGroupOption withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * IP地址组的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateIpGroupOption withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * IP地址组的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateIpGroupOption withIpList(List<UpadateIpGroupIpOption> ipList) {
        this.ipList = ipList;
        return this;
    }

    
    public UpdateIpGroupOption addIpListItem(UpadateIpGroupIpOption ipListItem) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        this.ipList.add(ipListItem);
        return this;
    }

    public UpdateIpGroupOption withIpList(Consumer<List<UpadateIpGroupIpOption>> ipListSetter) {
        if(this.ipList == null ){
            this.ipList = new ArrayList<>();
        }
        ipListSetter.accept(this.ipList);
        return this;
    }

    /**
     * IP地址组中包含的ip列表。
     * @return ipList
     */
    public List<UpadateIpGroupIpOption> getIpList() {
        return ipList;
    }

    public void setIpList(List<UpadateIpGroupIpOption> ipList) {
        this.ipList = ipList;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateIpGroupOption updateIpGroupOption = (UpdateIpGroupOption) o;
        return Objects.equals(this.description, updateIpGroupOption.description) &&
            Objects.equals(this.name, updateIpGroupOption.name) &&
            Objects.equals(this.ipList, updateIpGroupOption.ipList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(description, name, ipList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIpGroupOption {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
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

