package com.huaweicloud.sdk.rds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rds.v3.model.OffSiteBackupPolicy;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SetOffSiteBackupPolicyRequestBody
 */
public class SetOffSiteBackupPolicyRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policy_para")
    
    private OffSiteBackupPolicy policyPara = null;

    public SetOffSiteBackupPolicyRequestBody withPolicyPara(OffSiteBackupPolicy policyPara) {
        this.policyPara = policyPara;
        return this;
    }

    public SetOffSiteBackupPolicyRequestBody withPolicyPara(Consumer<OffSiteBackupPolicy> policyParaSetter) {
        if(this.policyPara == null ){
            this.policyPara = new OffSiteBackupPolicy();
            policyParaSetter.accept(this.policyPara);
        }
        
        return this;
    }


    /**
     * Get policyPara
     * @return policyPara
     */
    public OffSiteBackupPolicy getPolicyPara() {
        return policyPara;
    }

    public void setPolicyPara(OffSiteBackupPolicy policyPara) {
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

