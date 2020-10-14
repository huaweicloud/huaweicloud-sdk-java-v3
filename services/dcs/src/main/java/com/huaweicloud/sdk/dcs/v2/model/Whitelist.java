package com.huaweicloud.sdk.dcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * IP白名单分组列表结构体
 */
public class Whitelist  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_name")
    
    private String groupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_list")
    
    private List<String> ipList = new ArrayList<>();
    
    public Whitelist withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    


    /**
     * 白名单分组名称，每个实例支持创建4个分组。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Whitelist withIpList(List<String> ipList) {
        this.ipList = ipList;
        return this;
    }

    
    public Whitelist addIpListItem(String ipListItem) {
        this.ipList.add(ipListItem);
        return this;
    }

    public Whitelist withIpList(Consumer<List<String>> ipListSetter) {
        if(this.ipList == null ){
            this.ipList = new ArrayList<>();
        }
        ipListSetter.accept(this.ipList);
        return this;
    }

    /**
     * 白名单分组下的IP列表,每个实例最多可以添加20个IP地址/地址段。如果有多个，可以用逗号分隔。不支持的IP和地址段：0.0.0.0和0.0.0.0/0
     * @return ipList
     */
    public List<String> getIpList() {
        return ipList;
    }

    public void setIpList(List<String> ipList) {
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
        Whitelist whitelist = (Whitelist) o;
        return Objects.equals(this.groupName, whitelist.groupName) &&
            Objects.equals(this.ipList, whitelist.ipList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(groupName, ipList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Whitelist {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
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

