package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 安全认证诊断结果
 */
public class SecurityCertification {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private DiagnoseResult result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kerberos_info")

    private List<KerberosStatus> kerberosInfo = null;

    public SecurityCertification withResult(DiagnoseResult result) {
        this.result = result;
        return this;
    }

    /**
     * Get result
     * @return result
     */
    public DiagnoseResult getResult() {
        return result;
    }

    public void setResult(DiagnoseResult result) {
        this.result = result;
    }

    public SecurityCertification withKerberosInfo(List<KerberosStatus> kerberosInfo) {
        this.kerberosInfo = kerberosInfo;
        return this;
    }

    public SecurityCertification addKerberosInfoItem(KerberosStatus kerberosInfoItem) {
        if (this.kerberosInfo == null) {
            this.kerberosInfo = new ArrayList<>();
        }
        this.kerberosInfo.add(kerberosInfoItem);
        return this;
    }

    public SecurityCertification withKerberosInfo(Consumer<List<KerberosStatus>> kerberosInfoSetter) {
        if (this.kerberosInfo == null) {
            this.kerberosInfo = new ArrayList<>();
        }
        kerberosInfoSetter.accept(this.kerberosInfo);
        return this;
    }

    /**
     * kerberos信息
     * @return kerberosInfo
     */
    public List<KerberosStatus> getKerberosInfo() {
        return kerberosInfo;
    }

    public void setKerberosInfo(List<KerberosStatus> kerberosInfo) {
        this.kerberosInfo = kerberosInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityCertification that = (SecurityCertification) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.kerberosInfo, that.kerberosInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, kerberosInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityCertification {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    kerberosInfo: ").append(toIndentedString(kerberosInfo)).append("\n");
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
