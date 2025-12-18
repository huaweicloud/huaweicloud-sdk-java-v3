package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConfigurationDiffReqV3
 */
public class ConfigurationDiffReqV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diff_para")

    private ParaGroupDiff diffPara;

    public ConfigurationDiffReqV3 withDiffPara(ParaGroupDiff diffPara) {
        this.diffPara = diffPara;
        return this;
    }

    public ConfigurationDiffReqV3 withDiffPara(Consumer<ParaGroupDiff> diffParaSetter) {
        if (this.diffPara == null) {
            this.diffPara = new ParaGroupDiff();
            diffParaSetter.accept(this.diffPara);
        }

        return this;
    }

    /**
     * Get diffPara
     * @return diffPara
     */
    public ParaGroupDiff getDiffPara() {
        return diffPara;
    }

    public void setDiffPara(ParaGroupDiff diffPara) {
        this.diffPara = diffPara;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigurationDiffReqV3 that = (ConfigurationDiffReqV3) obj;
        return Objects.equals(this.diffPara, that.diffPara);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diffPara);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationDiffReqV3 {\n");
        sb.append("    diffPara: ").append(toIndentedString(diffPara)).append("\n");
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
