package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HyperCluster
 */
public class HyperCluster {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_info")

    private List<HyperClusterNetworkInfo> networkInfo = null;

    public HyperCluster withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：hyper cluster的ID。 **取值范围**：^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HyperCluster withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：hyper cluster的名称。 **取值范围**：^[-_.a-zA-Z0-9]{1,64}$。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HyperCluster withNetworkInfo(List<HyperClusterNetworkInfo> networkInfo) {
        this.networkInfo = networkInfo;
        return this;
    }

    public HyperCluster addNetworkInfoItem(HyperClusterNetworkInfo networkInfoItem) {
        if (this.networkInfo == null) {
            this.networkInfo = new ArrayList<>();
        }
        this.networkInfo.add(networkInfoItem);
        return this;
    }

    public HyperCluster withNetworkInfo(Consumer<List<HyperClusterNetworkInfo>> networkInfoSetter) {
        if (this.networkInfo == null) {
            this.networkInfo = new ArrayList<>();
        }
        networkInfoSetter.accept(this.networkInfo);
        return this;
    }

    /**
     * **参数解释**：网络信息。
     * @return networkInfo
     */
    public List<HyperClusterNetworkInfo> getNetworkInfo() {
        return networkInfo;
    }

    public void setNetworkInfo(List<HyperClusterNetworkInfo> networkInfo) {
        this.networkInfo = networkInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HyperCluster that = (HyperCluster) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.networkInfo, that.networkInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, networkInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HyperCluster {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    networkInfo: ").append(toIndentedString(networkInfo)).append("\n");
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
