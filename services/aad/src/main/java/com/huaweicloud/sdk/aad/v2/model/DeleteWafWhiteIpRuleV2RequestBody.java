package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteWafWhiteIpRuleV2RequestBody
 */
public class DeleteWafWhiteIpRuleV2RequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<String> ids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overseas_type")

    private Integer overseasType;

    public DeleteWafWhiteIpRuleV2RequestBody withIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public DeleteWafWhiteIpRuleV2RequestBody addIdsItem(String idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public DeleteWafWhiteIpRuleV2RequestBody withIds(Consumer<List<String>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * 待删除规则id
     * @return ids
     */
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public DeleteWafWhiteIpRuleV2RequestBody withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 域名+端口组合，标准端口80/443无须加端口。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public DeleteWafWhiteIpRuleV2RequestBody withOverseasType(Integer overseasType) {
        this.overseasType = overseasType;
        return this;
    }

    /**
     * 防护区域,0-大陆,1-海外
     * @return overseasType
     */
    public Integer getOverseasType() {
        return overseasType;
    }

    public void setOverseasType(Integer overseasType) {
        this.overseasType = overseasType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteWafWhiteIpRuleV2RequestBody that = (DeleteWafWhiteIpRuleV2RequestBody) obj;
        return Objects.equals(this.ids, that.ids) && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.overseasType, that.overseasType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids, domainName, overseasType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteWafWhiteIpRuleV2RequestBody {\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    overseasType: ").append(toIndentedString(overseasType)).append("\n");
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
