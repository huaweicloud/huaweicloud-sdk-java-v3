package com.huaweicloud.sdk.meeting.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 部门基本信息, 查询企业级别的管理员时需要显示部门信息
 */
public class DeptBasicDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deptCode")
    
    private String deptCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="corpId")
    
    private String corpId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deptName")
    
    private String deptName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deptNamePath")
    
    private String deptNamePath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parentDeptCode")
    
    private String parentDeptCode;

    public DeptBasicDTO withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    


    /**
     * 部门编码
     * @return deptCode
     */
    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public DeptBasicDTO withCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }

    


    /**
     * 企业id
     * @return corpId
     */
    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public DeptBasicDTO withDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    


    /**
     * 部门名称
     * @return deptName
     */
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public DeptBasicDTO withDeptNamePath(String deptNamePath) {
        this.deptNamePath = deptNamePath;
        return this;
    }

    


    /**
     * 部门名称路径
     * @return deptNamePath
     */
    public String getDeptNamePath() {
        return deptNamePath;
    }

    public void setDeptNamePath(String deptNamePath) {
        this.deptNamePath = deptNamePath;
    }

    public DeptBasicDTO withParentDeptCode(String parentDeptCode) {
        this.parentDeptCode = parentDeptCode;
        return this;
    }

    


    /**
     * 父部门编码
     * @return parentDeptCode
     */
    public String getParentDeptCode() {
        return parentDeptCode;
    }

    public void setParentDeptCode(String parentDeptCode) {
        this.parentDeptCode = parentDeptCode;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeptBasicDTO deptBasicDTO = (DeptBasicDTO) o;
        return Objects.equals(this.deptCode, deptBasicDTO.deptCode) &&
            Objects.equals(this.corpId, deptBasicDTO.corpId) &&
            Objects.equals(this.deptName, deptBasicDTO.deptName) &&
            Objects.equals(this.deptNamePath, deptBasicDTO.deptNamePath) &&
            Objects.equals(this.parentDeptCode, deptBasicDTO.parentDeptCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(deptCode, corpId, deptName, deptNamePath, parentDeptCode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeptBasicDTO {\n");
        sb.append("    deptCode: ").append(toIndentedString(deptCode)).append("\n");
        sb.append("    corpId: ").append(toIndentedString(corpId)).append("\n");
        sb.append("    deptName: ").append(toIndentedString(deptName)).append("\n");
        sb.append("    deptNamePath: ").append(toIndentedString(deptNamePath)).append("\n");
        sb.append("    parentDeptCode: ").append(toIndentedString(parentDeptCode)).append("\n");
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

