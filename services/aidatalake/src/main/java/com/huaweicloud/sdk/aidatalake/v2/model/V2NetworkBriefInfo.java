package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 网络配置简要信息（列表返回）。
 */
public class V2NetworkBriefInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr_in_vpc")

    private String cidrInVpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    public V2NetworkBriefInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：网络连接的ID。 **取值范围**：长度为1~64的英文、数字、中划线组合。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public V2NetworkBriefInfo withCidrInVpc(String cidrInVpc) {
        this.cidrInVpc = cidrInVpc;
        return this;
    }

    /**
     * **参数解释**：路由网段范围，标准的IPv4格式。 **取值范围**：允许网段为10.0.0.0~10.255.0.0/8~22,172.16.0.0~172.31.0.0/12~22,192.168.0.0~192.168.0.0/16~22。 
     * @return cidrInVpc
     */
    public String getCidrInVpc() {
        return cidrInVpc;
    }

    public void setCidrInVpc(String cidrInVpc) {
        this.cidrInVpc = cidrInVpc;
    }

    public V2NetworkBriefInfo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：资源创建时间。 **取值范围**：ISO 8601格式，yyyy-MM-dd'T'HH:mm:ss.SSSZ，UTC时间。 
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        V2NetworkBriefInfo that = (V2NetworkBriefInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.cidrInVpc, that.cidrInVpc)
            && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cidrInVpc, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V2NetworkBriefInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    cidrInVpc: ").append(toIndentedString(cidrInVpc)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
