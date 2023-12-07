package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListGaussMySqlInstancesUnifyStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<MysqlInstanceListInfoUnifyStatus> instances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListGaussMySqlInstancesUnifyStatusResponse withInstances(List<MysqlInstanceListInfoUnifyStatus> instances) {
        this.instances = instances;
        return this;
    }

    public ListGaussMySqlInstancesUnifyStatusResponse addInstancesItem(MysqlInstanceListInfoUnifyStatus instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ListGaussMySqlInstancesUnifyStatusResponse withInstances(
        Consumer<List<MysqlInstanceListInfoUnifyStatus>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 实例列表信息。
     * @return instances
     */
    public List<MysqlInstanceListInfoUnifyStatus> getInstances() {
        return instances;
    }

    public void setInstances(List<MysqlInstanceListInfoUnifyStatus> instances) {
        this.instances = instances;
    }

    public ListGaussMySqlInstancesUnifyStatusResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总记录数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGaussMySqlInstancesUnifyStatusResponse that = (ListGaussMySqlInstancesUnifyStatusResponse) obj;
        return Objects.equals(this.instances, that.instances) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instances, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGaussMySqlInstancesUnifyStatusResponse {\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
