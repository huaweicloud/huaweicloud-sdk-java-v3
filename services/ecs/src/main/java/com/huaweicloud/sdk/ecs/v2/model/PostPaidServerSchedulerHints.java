package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class PostPaidServerSchedulerHints  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group")
    
    private String group;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dedicated_host_id")
    
    private String dedicatedHostId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenancy")
    
    private String tenancy;

    public PostPaidServerSchedulerHints withGroup(String group) {
        this.group = group;
        return this;
    }

    


    /**
     * 云服务器组ID，UUID格式。
     * @return group
     */
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public PostPaidServerSchedulerHints withDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }

    


    /**
     * 专属主机的ID。专属主机的ID仅在tenancy为dedicated时生效。
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return dedicatedHostId;
    }

    public void setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
    }

    public PostPaidServerSchedulerHints withTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }

    


    /**
     * 在指定的专属主机或者共享主机上创建弹性云服务器云主机。参数值为shared或者dedicated。
     * @return tenancy
     */
    public String getTenancy() {
        return tenancy;
    }

    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostPaidServerSchedulerHints postPaidServerSchedulerHints = (PostPaidServerSchedulerHints) o;
        return Objects.equals(this.group, postPaidServerSchedulerHints.group) &&
            Objects.equals(this.dedicatedHostId, postPaidServerSchedulerHints.dedicatedHostId) &&
            Objects.equals(this.tenancy, postPaidServerSchedulerHints.tenancy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(group, dedicatedHostId, tenancy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostPaidServerSchedulerHints {\n");
            sb.append("    group: ").append(toIndentedString(group)).append("\n");
            sb.append("    dedicatedHostId: ").append(toIndentedString(dedicatedHostId)).append("\n");
            sb.append("    tenancy: ").append(toIndentedString(tenancy)).append("\n");
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

