package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 创建东西向防火墙body体 **约束限制**： 不涉及
 */
public class CreateEastWestFirewallRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er_id")

    private String erId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inspection_cidr")

    private String inspectionCidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    public CreateEastWestFirewallRequestBody withErId(String erId) {
        this.erId = erId;
        return this;
    }

    /**
     * **参数解释**： 出方向关联ER ID,可通过ER服务查询企业路由器列表接口获得，返回值中instances.id即为erid（.表示各对象之间层级的区分） **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return erId
     */
    public String getErId() {
        return erId;
    }

    public void setErId(String erId) {
        this.erId = erId;
    }

    public CreateEastWestFirewallRequestBody withInspectionCidr(String inspectionCidr) {
        this.inspectionCidr = inspectionCidr;
        return this;
    }

    /**
     * **参数解释**： 创建引流VPC时使用的网段 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return inspectionCidr
     */
    public String getInspectionCidr() {
        return inspectionCidr;
    }

    public void setInspectionCidr(String inspectionCidr) {
        this.inspectionCidr = inspectionCidr;
    }

    public CreateEastWestFirewallRequestBody withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * **参数解释**： 东西向防火墙模式，填写er **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateEastWestFirewallRequestBody that = (CreateEastWestFirewallRequestBody) obj;
        return Objects.equals(this.erId, that.erId) && Objects.equals(this.inspectionCidr, that.inspectionCidr)
            && Objects.equals(this.mode, that.mode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(erId, inspectionCidr, mode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEastWestFirewallRequestBody {\n");
        sb.append("    erId: ").append(toIndentedString(erId)).append("\n");
        sb.append("    inspectionCidr: ").append(toIndentedString(inspectionCidr)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
