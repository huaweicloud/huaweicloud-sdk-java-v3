package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** SetOffSiteBackupPolicyRequestBody */
public class SetOffSiteBackupPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_para")

    private List<OffSiteBackupPolicy> policyPara = null;

    public SetOffSiteBackupPolicyRequestBody withPolicyPara(List<OffSiteBackupPolicy> policyPara) {
        this.policyPara = policyPara;
        return this;
    }

    public SetOffSiteBackupPolicyRequestBody addPolicyParaItem(OffSiteBackupPolicy policyParaItem) {
        if (this.policyPara == null) {
            this.policyPara = new ArrayList<>();
        }
        this.policyPara.add(policyParaItem);
        return this;
    }

    public SetOffSiteBackupPolicyRequestBody withPolicyPara(Consumer<List<OffSiteBackupPolicy>> policyParaSetter) {
        if (this.policyPara == null) {
            this.policyPara = new ArrayList<>();
        }
        policyParaSetter.accept(this.policyPara);
        return this;
    }

    /** 备份策略对象，包括备份类型、备份保留天数、目标区域ID和目标project ID。
     * 
     * @return policyPara */
    public List<OffSiteBackupPolicy> getPolicyPara() {
        return policyPara;
    }

    public void setPolicyPara(List<OffSiteBackupPolicy> policyPara) {
        this.policyPara = policyPara;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetOffSiteBackupPolicyRequestBody setOffSiteBackupPolicyRequestBody = (SetOffSiteBackupPolicyRequestBody) o;
        return Objects.equals(this.policyPara, setOffSiteBackupPolicyRequestBody.policyPara);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyPara);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetOffSiteBackupPolicyRequestBody {\n");
        sb.append("    policyPara: ").append(toIndentedString(policyPara)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
