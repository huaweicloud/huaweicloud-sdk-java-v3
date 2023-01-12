package com.huaweicloud.sdk.ges.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v2.model.CreateGraphReqGraphEncryption;
import com.huaweicloud.sdk.ges.v2.model.CreateGraphReqGraphLtsOperationTrace;
import com.huaweicloud.sdk.ges.v2.model.CreateGraphReqGraphPublicIp;
import com.huaweicloud.sdk.ges.v2.model.CreateGraphReqGraphSysTags;
import com.huaweicloud.sdk.ges.v2.model.CreateGraphReqGraphVertexIdType;
import com.huaweicloud.sdk.ges.v2.model.ListGraphsRespTags;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 图类型。
 */
public class CreateGraphReqGraph  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="graph_size_type_index")
    
    
    private String graphSizeTypeIndex;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="arch")
    
    
    private String arch;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_id")
    
    
    private String subnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group_id")
    
    
    private String securityGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_ip")
    
    
    private CreateGraphReqGraphPublicIp publicIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_multi_az")
    
    
    private Boolean enableMultiAz;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="encryption")
    
    
    private CreateGraphReqGraphEncryption encryption;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lts_operation_trace")
    
    
    private CreateGraphReqGraphLtsOperationTrace ltsOperationTrace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sys_tags")
    
    
    private List<CreateGraphReqGraphSysTags> sysTags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    
    private List<ListGraphsRespTags> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_rbac")
    
    
    private Boolean enableRbac;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_full_text_index")
    
    
    private Boolean enableFullTextIndex;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_hyg")
    
    
    private Boolean enableHyg;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="crypt_algorithm")
    
    
    private String cryptAlgorithm;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_https")
    
    
    private Boolean enableHttps;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_type")
    
    
    private String productType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vertex_id_type")
    
    
    private CreateGraphReqGraphVertexIdType vertexIdType;

    public CreateGraphReqGraph withName(String name) {
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

    

    public CreateGraphReqGraph withGraphSizeTypeIndex(String graphSizeTypeIndex) {
        this.graphSizeTypeIndex = graphSizeTypeIndex;
        return this;
    }

    


    /**
     * 图规模类型索引。  - 0：一万边 - 1：百万边 - 2：千万边 - 3：一亿边 - 4：十亿边 - 5：百亿边 - 6：千亿边 - 401：十亿增强边
     * @return graphSizeTypeIndex
     */
    public String getGraphSizeTypeIndex() {
        return graphSizeTypeIndex;
    }

    public void setGraphSizeTypeIndex(String graphSizeTypeIndex) {
        this.graphSizeTypeIndex = graphSizeTypeIndex;
    }

    

    public CreateGraphReqGraph withArch(String arch) {
        this.arch = arch;
        return this;
    }

    


    /**
     * 图实例CPU架构类型，取值为x86_64和aarch64。默认取x86_64。  - x86_64：X64 64位架构。 - aarch64：ARM 64位架构。
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    

    public CreateGraphReqGraph withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * 虚拟私有云ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    

    public CreateGraphReqGraph withSubnetId(String subnetId) {
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

    

    public CreateGraphReqGraph withSecurityGroupId(String securityGroupId) {
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

    

    public CreateGraphReqGraph withPublicIp(CreateGraphReqGraphPublicIp publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    public CreateGraphReqGraph withPublicIp(Consumer<CreateGraphReqGraphPublicIp> publicIpSetter) {
        if(this.publicIp == null ){
            this.publicIp = new CreateGraphReqGraphPublicIp();
            publicIpSetter.accept(this.publicIp);
        }
        
        return this;
    }


    /**
     * Get publicIp
     * @return publicIp
     */
    public CreateGraphReqGraphPublicIp getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(CreateGraphReqGraphPublicIp publicIp) {
        this.publicIp = publicIp;
    }

    

    public CreateGraphReqGraph withEnableMultiAz(Boolean enableMultiAz) {
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

    

    public CreateGraphReqGraph withEncryption(CreateGraphReqGraphEncryption encryption) {
        this.encryption = encryption;
        return this;
    }

    public CreateGraphReqGraph withEncryption(Consumer<CreateGraphReqGraphEncryption> encryptionSetter) {
        if(this.encryption == null ){
            this.encryption = new CreateGraphReqGraphEncryption();
            encryptionSetter.accept(this.encryption);
        }
        
        return this;
    }


    /**
     * Get encryption
     * @return encryption
     */
    public CreateGraphReqGraphEncryption getEncryption() {
        return encryption;
    }

    public void setEncryption(CreateGraphReqGraphEncryption encryption) {
        this.encryption = encryption;
    }

    

    public CreateGraphReqGraph withLtsOperationTrace(CreateGraphReqGraphLtsOperationTrace ltsOperationTrace) {
        this.ltsOperationTrace = ltsOperationTrace;
        return this;
    }

    public CreateGraphReqGraph withLtsOperationTrace(Consumer<CreateGraphReqGraphLtsOperationTrace> ltsOperationTraceSetter) {
        if(this.ltsOperationTrace == null ){
            this.ltsOperationTrace = new CreateGraphReqGraphLtsOperationTrace();
            ltsOperationTraceSetter.accept(this.ltsOperationTrace);
        }
        
        return this;
    }


    /**
     * Get ltsOperationTrace
     * @return ltsOperationTrace
     */
    public CreateGraphReqGraphLtsOperationTrace getLtsOperationTrace() {
        return ltsOperationTrace;
    }

    public void setLtsOperationTrace(CreateGraphReqGraphLtsOperationTrace ltsOperationTrace) {
        this.ltsOperationTrace = ltsOperationTrace;
    }

    

    public CreateGraphReqGraph withSysTags(List<CreateGraphReqGraphSysTags> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    
    public CreateGraphReqGraph addSysTagsItem(CreateGraphReqGraphSysTags sysTagsItem) {
        if(this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public CreateGraphReqGraph withSysTags(Consumer<List<CreateGraphReqGraphSysTags>> sysTagsSetter) {
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
    public List<CreateGraphReqGraphSysTags> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<CreateGraphReqGraphSysTags> sysTags) {
        this.sysTags = sysTags;
    }

    

    public CreateGraphReqGraph withTags(List<ListGraphsRespTags> tags) {
        this.tags = tags;
        return this;
    }

    
    public CreateGraphReqGraph addTagsItem(ListGraphsRespTags tagsItem) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateGraphReqGraph withTags(Consumer<List<ListGraphsRespTags>> tagsSetter) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 支持标签TMS，做费用归集，默认不开启。
     * @return tags
     */
    public List<ListGraphsRespTags> getTags() {
        return tags;
    }

    public void setTags(List<ListGraphsRespTags> tags) {
        this.tags = tags;
    }

    

    public CreateGraphReqGraph withEnableRbac(Boolean enableRbac) {
        this.enableRbac = enableRbac;
        return this;
    }

    


    /**
     * 创建的图是否启用细粒度权限控制，默认不启用，值为false。如果设置为true，创建的图所有用户都没有权限，需要调用业务面细粒度权限控制API进行授权操作才可以访问图。
     * @return enableRbac
     */
    public Boolean getEnableRbac() {
        return enableRbac;
    }

    public void setEnableRbac(Boolean enableRbac) {
        this.enableRbac = enableRbac;
    }

    

    public CreateGraphReqGraph withEnableFullTextIndex(Boolean enableFullTextIndex) {
        this.enableFullTextIndex = enableFullTextIndex;
        return this;
    }

    


    /**
     * 创建的图是否开启全文索引控制，默认不启用，值为false。 如果设置为true，十亿增强版-规格版图支持全文索引，创建图时会创建云搜索服务集群。 > 开启全文索引功能。如果CSS服务已经部署，图实例会自动创建CSS集群，图创建时间较长。如果CSS服务没有部署则图创建失败。
     * @return enableFullTextIndex
     */
    public Boolean getEnableFullTextIndex() {
        return enableFullTextIndex;
    }

    public void setEnableFullTextIndex(Boolean enableFullTextIndex) {
        this.enableFullTextIndex = enableFullTextIndex;
    }

    

    public CreateGraphReqGraph withEnableHyg(Boolean enableHyg) {
        this.enableHyg = enableHyg;
        return this;
    }

    


    /**
     * 该参数只对千亿规格图生效。
     * @return enableHyg
     */
    public Boolean getEnableHyg() {
        return enableHyg;
    }

    public void setEnableHyg(Boolean enableHyg) {
        this.enableHyg = enableHyg;
    }

    

    public CreateGraphReqGraph withCryptAlgorithm(String cryptAlgorithm) {
        this.cryptAlgorithm = cryptAlgorithm;
        return this;
    }

    


    /**
     * 图实例加密算法，取值为：  - generalCipher：国密算法 - SMcompatible：商密算法（兼容国际）
     * @return cryptAlgorithm
     */
    public String getCryptAlgorithm() {
        return cryptAlgorithm;
    }

    public void setCryptAlgorithm(String cryptAlgorithm) {
        this.cryptAlgorithm = cryptAlgorithm;
    }

    

    public CreateGraphReqGraph withEnableHttps(Boolean enableHttps) {
        this.enableHttps = enableHttps;
        return this;
    }

    


    /**
     * 是否开启安全模式，开启安全模式会对性能有较大影响
     * @return enableHttps
     */
    public Boolean getEnableHttps() {
        return enableHttps;
    }

    public void setEnableHttps(Boolean enableHttps) {
        this.enableHttps = enableHttps;
    }

    

    public CreateGraphReqGraph withProductType(String productType) {
        this.productType = productType;
        return this;
    }

    


    /**
     * 图产品类型，取值为InMemory和Persistence，默认为InMemory，当graph_size_type_index取值为\"6\"时，默认为Persistence。  - InMemory：内存版 - Persistence：持久化版
     * @return productType
     */
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    

    public CreateGraphReqGraph withVertexIdType(CreateGraphReqGraphVertexIdType vertexIdType) {
        this.vertexIdType = vertexIdType;
        return this;
    }

    public CreateGraphReqGraph withVertexIdType(Consumer<CreateGraphReqGraphVertexIdType> vertexIdTypeSetter) {
        if(this.vertexIdType == null ){
            this.vertexIdType = new CreateGraphReqGraphVertexIdType();
            vertexIdTypeSetter.accept(this.vertexIdType);
        }
        
        return this;
    }


    /**
     * Get vertexIdType
     * @return vertexIdType
     */
    public CreateGraphReqGraphVertexIdType getVertexIdType() {
        return vertexIdType;
    }

    public void setVertexIdType(CreateGraphReqGraphVertexIdType vertexIdType) {
        this.vertexIdType = vertexIdType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateGraphReqGraph createGraphReqGraph = (CreateGraphReqGraph) o;
        return Objects.equals(this.name, createGraphReqGraph.name) &&
            Objects.equals(this.graphSizeTypeIndex, createGraphReqGraph.graphSizeTypeIndex) &&
            Objects.equals(this.arch, createGraphReqGraph.arch) &&
            Objects.equals(this.vpcId, createGraphReqGraph.vpcId) &&
            Objects.equals(this.subnetId, createGraphReqGraph.subnetId) &&
            Objects.equals(this.securityGroupId, createGraphReqGraph.securityGroupId) &&
            Objects.equals(this.publicIp, createGraphReqGraph.publicIp) &&
            Objects.equals(this.enableMultiAz, createGraphReqGraph.enableMultiAz) &&
            Objects.equals(this.encryption, createGraphReqGraph.encryption) &&
            Objects.equals(this.ltsOperationTrace, createGraphReqGraph.ltsOperationTrace) &&
            Objects.equals(this.sysTags, createGraphReqGraph.sysTags) &&
            Objects.equals(this.tags, createGraphReqGraph.tags) &&
            Objects.equals(this.enableRbac, createGraphReqGraph.enableRbac) &&
            Objects.equals(this.enableFullTextIndex, createGraphReqGraph.enableFullTextIndex) &&
            Objects.equals(this.enableHyg, createGraphReqGraph.enableHyg) &&
            Objects.equals(this.cryptAlgorithm, createGraphReqGraph.cryptAlgorithm) &&
            Objects.equals(this.enableHttps, createGraphReqGraph.enableHttps) &&
            Objects.equals(this.productType, createGraphReqGraph.productType) &&
            Objects.equals(this.vertexIdType, createGraphReqGraph.vertexIdType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, graphSizeTypeIndex, arch, vpcId, subnetId, securityGroupId, publicIp, enableMultiAz, encryption, ltsOperationTrace, sysTags, tags, enableRbac, enableFullTextIndex, enableHyg, cryptAlgorithm, enableHttps, productType, vertexIdType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGraphReqGraph {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    graphSizeTypeIndex: ").append(toIndentedString(graphSizeTypeIndex)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    enableMultiAz: ").append(toIndentedString(enableMultiAz)).append("\n");
        sb.append("    encryption: ").append(toIndentedString(encryption)).append("\n");
        sb.append("    ltsOperationTrace: ").append(toIndentedString(ltsOperationTrace)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    enableRbac: ").append(toIndentedString(enableRbac)).append("\n");
        sb.append("    enableFullTextIndex: ").append(toIndentedString(enableFullTextIndex)).append("\n");
        sb.append("    enableHyg: ").append(toIndentedString(enableHyg)).append("\n");
        sb.append("    cryptAlgorithm: ").append(toIndentedString(cryptAlgorithm)).append("\n");
        sb.append("    enableHttps: ").append(toIndentedString(enableHttps)).append("\n");
        sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
        sb.append("    vertexIdType: ").append(toIndentedString(vertexIdType)).append("\n");
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

