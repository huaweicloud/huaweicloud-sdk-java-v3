package com.huaweicloud.sdk.ges.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v1.model.DataSource;
import com.huaweicloud.sdk.ges.v1.model.EncryptionReq;
import com.huaweicloud.sdk.ges.v1.model.LtsOperationTraceReq;
import com.huaweicloud.sdk.ges.v1.model.PublicIp;
import com.huaweicloud.sdk.ges.v1.model.SysTagsRes;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class Graph  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="graphSizeTypeIndex")
    
    
    private Integer graphSizeTypeIndex;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="arch")
    
    
    private String arch;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dataSource")
    
    
    private DataSource dataSource;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpcId")
    
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnetId")
    
    
    private String subnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="securityGroupId")
    
    
    private String securityGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publicIp")
    
    
    private PublicIp publicIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enableMultiAz")
    
    
    private Boolean enableMultiAz;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="encryption")
    
    
    private EncryptionReq encryption;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ltsOperationTrace")
    
    
    private LtsOperationTraceReq ltsOperationTrace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sys_tags")
    
    
    private List<SysTagsRes> sysTags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enableRBAC")
    
    
    private Boolean enableRBAC;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enableFullTextIndex")
    
    
    private Boolean enableFullTextIndex;

    public Graph withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 图名称（输入长度在4位到50位之间，必须以字母开头，可以包含字母、数字或者下划线，不能包含其他的特殊字符）。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Graph withGraphSizeTypeIndex(Integer graphSizeTypeIndex) {
        this.graphSizeTypeIndex = graphSizeTypeIndex;
        return this;
    }

    


    /**
     * 图规模类型索引。 - 0：一万边 - 1：百万边 - 2：千万边 - 3：一亿边 - 4：十亿边 - 5：百亿边 - 401：十亿增强边
     * @return graphSizeTypeIndex
     */
    public Integer getGraphSizeTypeIndex() {
        return graphSizeTypeIndex;
    }

    public void setGraphSizeTypeIndex(Integer graphSizeTypeIndex) {
        this.graphSizeTypeIndex = graphSizeTypeIndex;
    }

    

    public Graph withArch(String arch) {
        this.arch = arch;
        return this;
    }

    


    /**
     * 图实例CPU架构类型，取值为x86_64和aarch64。默认取x86_64。 - x86_64：X64 64位架构。 - aarch64：ARM 64位架构。
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    

    public Graph withDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    public Graph withDataSource(Consumer<DataSource> dataSourceSetter) {
        if(this.dataSource == null ){
            this.dataSource = new DataSource();
            dataSourceSetter.accept(this.dataSource);
        }
        
        return this;
    }


    /**
     * Get dataSource
     * @return dataSource
     */
    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    

    public Graph withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     *   虚拟私有云ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    

    public Graph withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    


    /**
     * 指定虚拟私有云下的子网ID。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    

    public Graph withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    


    /**
     * 安全组ID。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    

    public Graph withPublicIp(PublicIp publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    public Graph withPublicIp(Consumer<PublicIp> publicIpSetter) {
        if(this.publicIp == null ){
            this.publicIp = new PublicIp();
            publicIpSetter.accept(this.publicIp);
        }
        
        return this;
    }


    /**
     * Get publicIp
     * @return publicIp
     */
    public PublicIp getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(PublicIp publicIp) {
        this.publicIp = publicIp;
    }

    

    public Graph withEnableMultiAz(Boolean enableMultiAz) {
        this.enableMultiAz = enableMultiAz;
        return this;
    }

    


    /**
     * 创建的图是否支持跨可用区（AZ），默认值是false，如果设置为true，系统将会把图中的ECS建在两个可用区中。  如果创建图时，不加该参数，则会将图中的ECS都建在一个可用区中。
     * @return enableMultiAz
     */
    public Boolean getEnableMultiAz() {
        return enableMultiAz;
    }

    public void setEnableMultiAz(Boolean enableMultiAz) {
        this.enableMultiAz = enableMultiAz;
    }

    

    public Graph withEncryption(EncryptionReq encryption) {
        this.encryption = encryption;
        return this;
    }

    public Graph withEncryption(Consumer<EncryptionReq> encryptionSetter) {
        if(this.encryption == null ){
            this.encryption = new EncryptionReq();
            encryptionSetter.accept(this.encryption);
        }
        
        return this;
    }


    /**
     * Get encryption
     * @return encryption
     */
    public EncryptionReq getEncryption() {
        return encryption;
    }

    public void setEncryption(EncryptionReq encryption) {
        this.encryption = encryption;
    }

    

    public Graph withLtsOperationTrace(LtsOperationTraceReq ltsOperationTrace) {
        this.ltsOperationTrace = ltsOperationTrace;
        return this;
    }

    public Graph withLtsOperationTrace(Consumer<LtsOperationTraceReq> ltsOperationTraceSetter) {
        if(this.ltsOperationTrace == null ){
            this.ltsOperationTrace = new LtsOperationTraceReq();
            ltsOperationTraceSetter.accept(this.ltsOperationTrace);
        }
        
        return this;
    }


    /**
     * Get ltsOperationTrace
     * @return ltsOperationTrace
     */
    public LtsOperationTraceReq getLtsOperationTrace() {
        return ltsOperationTrace;
    }

    public void setLtsOperationTrace(LtsOperationTraceReq ltsOperationTrace) {
        this.ltsOperationTrace = ltsOperationTrace;
    }

    

    public Graph withSysTags(List<SysTagsRes> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    
    public Graph addSysTagsItem(SysTagsRes sysTagsItem) {
        if(this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public Graph withSysTags(Consumer<List<SysTagsRes>> sysTagsSetter) {
        if(this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 企业项目信息，如果未指定则不开启，默认不开启。
     * @return sysTags
     */
    public List<SysTagsRes> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<SysTagsRes> sysTags) {
        this.sysTags = sysTags;
    }

    

    public Graph withEnableRBAC(Boolean enableRBAC) {
        this.enableRBAC = enableRBAC;
        return this;
    }

    


    /**
     * 创建的图是否启用细粒度权限控制，默认不启用，值为false。如果设置为true，创建的图所有用户都没有权限，需要调用业务面细粒度权限控制API进行授权操作才可以访问图。
     * @return enableRBAC
     */
    public Boolean getEnableRBAC() {
        return enableRBAC;
    }

    public void setEnableRBAC(Boolean enableRBAC) {
        this.enableRBAC = enableRBAC;
    }

    

    public Graph withEnableFullTextIndex(Boolean enableFullTextIndex) {
        this.enableFullTextIndex = enableFullTextIndex;
        return this;
    }

    


    /**
     * 创建的图是否开启全文索引控制，默认不启用，值为false。如果设置为true，十亿增强版-规格版图支持全文索引，创建图时会创建云搜索服务集群。 >开启全文索引功能。如果CSS服务已经部署，图实例会自动创建CSS集群，图创建时间较长。如果CSS服务没有部署则图创建失败。
     * @return enableFullTextIndex
     */
    public Boolean getEnableFullTextIndex() {
        return enableFullTextIndex;
    }

    public void setEnableFullTextIndex(Boolean enableFullTextIndex) {
        this.enableFullTextIndex = enableFullTextIndex;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Graph graph = (Graph) o;
        return Objects.equals(this.name, graph.name) &&
            Objects.equals(this.graphSizeTypeIndex, graph.graphSizeTypeIndex) &&
            Objects.equals(this.arch, graph.arch) &&
            Objects.equals(this.dataSource, graph.dataSource) &&
            Objects.equals(this.vpcId, graph.vpcId) &&
            Objects.equals(this.subnetId, graph.subnetId) &&
            Objects.equals(this.securityGroupId, graph.securityGroupId) &&
            Objects.equals(this.publicIp, graph.publicIp) &&
            Objects.equals(this.enableMultiAz, graph.enableMultiAz) &&
            Objects.equals(this.encryption, graph.encryption) &&
            Objects.equals(this.ltsOperationTrace, graph.ltsOperationTrace) &&
            Objects.equals(this.sysTags, graph.sysTags) &&
            Objects.equals(this.enableRBAC, graph.enableRBAC) &&
            Objects.equals(this.enableFullTextIndex, graph.enableFullTextIndex);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, graphSizeTypeIndex, arch, dataSource, vpcId, subnetId, securityGroupId, publicIp, enableMultiAz, encryption, ltsOperationTrace, sysTags, enableRBAC, enableFullTextIndex);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Graph {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    graphSizeTypeIndex: ").append(toIndentedString(graphSizeTypeIndex)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    enableMultiAz: ").append(toIndentedString(enableMultiAz)).append("\n");
        sb.append("    encryption: ").append(toIndentedString(encryption)).append("\n");
        sb.append("    ltsOperationTrace: ").append(toIndentedString(ltsOperationTrace)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
        sb.append("    enableRBAC: ").append(toIndentedString(enableRBAC)).append("\n");
        sb.append("    enableFullTextIndex: ").append(toIndentedString(enableFullTextIndex)).append("\n");
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

