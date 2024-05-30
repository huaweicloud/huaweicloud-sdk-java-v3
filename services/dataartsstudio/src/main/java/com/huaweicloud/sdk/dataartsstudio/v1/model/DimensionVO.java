package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DimensionVO
 */
public class DimensionVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    /**
     * 维度类型。 枚举值：   - COMMON: 普通维度   - LOOKUP: 码表维度   - HIERARCHIES: 层级维度 
     */
    public static final class DimensionTypeEnum {

        /**
         * Enum COMMON for value: "COMMON"
         */
        public static final DimensionTypeEnum COMMON = new DimensionTypeEnum("COMMON");

        /**
         * Enum LOOKUP for value: "LOOKUP"
         */
        public static final DimensionTypeEnum LOOKUP = new DimensionTypeEnum("LOOKUP");

        /**
         * Enum HIERARCHIES for value: "HIERARCHIES"
         */
        public static final DimensionTypeEnum HIERARCHIES = new DimensionTypeEnum("HIERARCHIES");

        private static final Map<String, DimensionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DimensionTypeEnum> createStaticFields() {
            Map<String, DimensionTypeEnum> map = new HashMap<>();
            map.put("COMMON", COMMON);
            map.put("LOOKUP", LOOKUP);
            map.put("HIERARCHIES", HIERARCHIES);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DimensionTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DimensionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DimensionTypeEnum(value));
        }

        public static DimensionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DimensionTypeEnum) {
                return this.value.equals(((DimensionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension_type")

    private DimensionTypeEnum dimensionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_ch")

    private String nameCh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_by")

    private String updateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_table_id")

    private String codeTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_table")

    private CodeTableVO codeTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l1_id")

    private String l1Id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l2_id")

    private String l2Id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l3_id")

    private String l3Id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hierarchies")

    private List<DimensionHierarchiesVO> hierarchies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private BizStatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_info")

    private ApprovalVO approvalInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_biz")

    private BizVersionManageVO newBiz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l1")

    private String l1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l2")

    private String l2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l3")

    private String l3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private List<DimensionAttributeVO> attributes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mappings")

    private List<TableMappingVO> mappings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource")

    private BizDatasourceRelationVO datasource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_location")

    private String obsLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_type")

    private String tableType;

    /**
     * DISTRIBUTE BY [HASH(column)|REPLICATION]。 枚举值：   - HASH: 对指定的列进行Hash，通过映射，把数据分布到指定DN   - REPLICATION: 表的每一行存在所有数据节点（DN）中，即每个数据节点都有完整的表数据 
     */
    public static final class DistributeEnum {

        /**
         * Enum HASH for value: "HASH"
         */
        public static final DistributeEnum HASH = new DistributeEnum("HASH");

        /**
         * Enum REPLICATION for value: "REPLICATION"
         */
        public static final DistributeEnum REPLICATION = new DistributeEnum("REPLICATION");

        private static final Map<String, DistributeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DistributeEnum> createStaticFields() {
            Map<String, DistributeEnum> map = new HashMap<>();
            map.put("HASH", HASH);
            map.put("REPLICATION", REPLICATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DistributeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DistributeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DistributeEnum(value));
        }

        public static DistributeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DistributeEnum) {
                return this.value.equals(((DistributeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "distribute")

    private DistributeEnum distribute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "distribute_column")

    private String distributeColumn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "self_defined_fields")

    private List<SelfDefinedFieldVO> selfDefinedFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private String configs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dev_version")

    private String devVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prod_version")

    private String prodVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dev_version_name")

    private String devVersionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prod_version_name")

    private String prodVersionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_type")

    private EnvTypeEnum envType;

    public DimensionVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 编码，填写String类型替代Long类型。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DimensionVO withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 字段名。
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public DimensionVO withDimensionType(DimensionTypeEnum dimensionType) {
        this.dimensionType = dimensionType;
        return this;
    }

    /**
     * 维度类型。 枚举值：   - COMMON: 普通维度   - LOOKUP: 码表维度   - HIERARCHIES: 层级维度 
     * @return dimensionType
     */
    public DimensionTypeEnum getDimensionType() {
        return dimensionType;
    }

    public void setDimensionType(DimensionTypeEnum dimensionType) {
        this.dimensionType = dimensionType;
    }

    public DimensionVO withNameCh(String nameCh) {
        this.nameCh = nameCh;
        return this;
    }

    /**
     * 业务属性。
     * @return nameCh
     */
    public String getNameCh() {
        return nameCh;
    }

    public void setNameCh(String nameCh) {
        this.nameCh = nameCh;
    }

    public DimensionVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DimensionVO withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建人。
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public DimensionVO withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    /**
     * 更新人。
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public DimensionVO withCodeTableId(String codeTableId) {
        this.codeTableId = codeTableId;
        return this;
    }

    /**
     * 引用码表ID，填写String类型替代Long类型。
     * @return codeTableId
     */
    public String getCodeTableId() {
        return codeTableId;
    }

    public void setCodeTableId(String codeTableId) {
        this.codeTableId = codeTableId;
    }

    public DimensionVO withCodeTable(CodeTableVO codeTable) {
        this.codeTable = codeTable;
        return this;
    }

    public DimensionVO withCodeTable(Consumer<CodeTableVO> codeTableSetter) {
        if (this.codeTable == null) {
            this.codeTable = new CodeTableVO();
            codeTableSetter.accept(this.codeTable);
        }

        return this;
    }

    /**
     * Get codeTable
     * @return codeTable
     */
    public CodeTableVO getCodeTable() {
        return codeTable;
    }

    public void setCodeTable(CodeTableVO codeTable) {
        this.codeTable = codeTable;
    }

    public DimensionVO withL1Id(String l1Id) {
        this.l1Id = l1Id;
        return this;
    }

    /**
     * 主题域分组ID，只读，填写String类型替代Long类型。
     * @return l1Id
     */
    public String getL1Id() {
        return l1Id;
    }

    public void setL1Id(String l1Id) {
        this.l1Id = l1Id;
    }

    public DimensionVO withL2Id(String l2Id) {
        this.l2Id = l2Id;
        return this;
    }

    /**
     * 主题域ID，只读，创建和更新时无需填写。
     * @return l2Id
     */
    public String getL2Id() {
        return l2Id;
    }

    public void setL2Id(String l2Id) {
        this.l2Id = l2Id;
    }

    public DimensionVO withL3Id(String l3Id) {
        this.l3Id = l3Id;
        return this;
    }

    /**
     * 业务对象ID，填写String类型替代Long类型。
     * @return l3Id
     */
    public String getL3Id() {
        return l3Id;
    }

    public void setL3Id(String l3Id) {
        this.l3Id = l3Id;
    }

    public DimensionVO withHierarchies(List<DimensionHierarchiesVO> hierarchies) {
        this.hierarchies = hierarchies;
        return this;
    }

    public DimensionVO addHierarchiesItem(DimensionHierarchiesVO hierarchiesItem) {
        if (this.hierarchies == null) {
            this.hierarchies = new ArrayList<>();
        }
        this.hierarchies.add(hierarchiesItem);
        return this;
    }

    public DimensionVO withHierarchies(Consumer<List<DimensionHierarchiesVO>> hierarchiesSetter) {
        if (this.hierarchies == null) {
            this.hierarchies = new ArrayList<>();
        }
        hierarchiesSetter.accept(this.hierarchies);
        return this;
    }

    /**
     * 层级属性。
     * @return hierarchies
     */
    public List<DimensionHierarchiesVO> getHierarchies() {
        return hierarchies;
    }

    public void setHierarchies(List<DimensionHierarchiesVO> hierarchies) {
        this.hierarchies = hierarchies;
    }

    public DimensionVO withStatus(BizStatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public BizStatusEnum getStatus() {
        return status;
    }

    public void setStatus(BizStatusEnum status) {
        this.status = status;
    }

    public DimensionVO withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，只读，格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public DimensionVO withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，只读，格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z。
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public DimensionVO withApprovalInfo(ApprovalVO approvalInfo) {
        this.approvalInfo = approvalInfo;
        return this;
    }

    public DimensionVO withApprovalInfo(Consumer<ApprovalVO> approvalInfoSetter) {
        if (this.approvalInfo == null) {
            this.approvalInfo = new ApprovalVO();
            approvalInfoSetter.accept(this.approvalInfo);
        }

        return this;
    }

    /**
     * Get approvalInfo
     * @return approvalInfo
     */
    public ApprovalVO getApprovalInfo() {
        return approvalInfo;
    }

    public void setApprovalInfo(ApprovalVO approvalInfo) {
        this.approvalInfo = approvalInfo;
    }

    public DimensionVO withNewBiz(BizVersionManageVO newBiz) {
        this.newBiz = newBiz;
        return this;
    }

    public DimensionVO withNewBiz(Consumer<BizVersionManageVO> newBizSetter) {
        if (this.newBiz == null) {
            this.newBiz = new BizVersionManageVO();
            newBizSetter.accept(this.newBiz);
        }

        return this;
    }

    /**
     * Get newBiz
     * @return newBiz
     */
    public BizVersionManageVO getNewBiz() {
        return newBiz;
    }

    public void setNewBiz(BizVersionManageVO newBiz) {
        this.newBiz = newBiz;
    }

    public DimensionVO withL1(String l1) {
        this.l1 = l1;
        return this;
    }

    /**
     * 主题域分组中文名，只读，创建和更新时无需填写。
     * @return l1
     */
    public String getL1() {
        return l1;
    }

    public void setL1(String l1) {
        this.l1 = l1;
    }

    public DimensionVO withL2(String l2) {
        this.l2 = l2;
        return this;
    }

    /**
     * 主题域中文名，只读，创建和更新时无需填写。
     * @return l2
     */
    public String getL2() {
        return l2;
    }

    public void setL2(String l2) {
        this.l2 = l2;
    }

    public DimensionVO withL3(String l3) {
        this.l3 = l3;
        return this;
    }

    /**
     * 业务对象中文名，只读，创建和更新时无需填写。
     * @return l3
     */
    public String getL3() {
        return l3;
    }

    public void setL3(String l3) {
        this.l3 = l3;
    }

    public DimensionVO withAttributes(List<DimensionAttributeVO> attributes) {
        this.attributes = attributes;
        return this;
    }

    public DimensionVO addAttributesItem(DimensionAttributeVO attributesItem) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(attributesItem);
        return this;
    }

    public DimensionVO withAttributes(Consumer<List<DimensionAttributeVO>> attributesSetter) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        attributesSetter.accept(this.attributes);
        return this;
    }

    /**
     * 维度属性信息。
     * @return attributes
     */
    public List<DimensionAttributeVO> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<DimensionAttributeVO> attributes) {
        this.attributes = attributes;
    }

    public DimensionVO withMappings(List<TableMappingVO> mappings) {
        this.mappings = mappings;
        return this;
    }

    public DimensionVO addMappingsItem(TableMappingVO mappingsItem) {
        if (this.mappings == null) {
            this.mappings = new ArrayList<>();
        }
        this.mappings.add(mappingsItem);
        return this;
    }

    public DimensionVO withMappings(Consumer<List<TableMappingVO>> mappingsSetter) {
        if (this.mappings == null) {
            this.mappings = new ArrayList<>();
        }
        mappingsSetter.accept(this.mappings);
        return this;
    }

    /**
     * 表映射信息。
     * @return mappings
     */
    public List<TableMappingVO> getMappings() {
        return mappings;
    }

    public void setMappings(List<TableMappingVO> mappings) {
        this.mappings = mappings;
    }

    public DimensionVO withDatasource(BizDatasourceRelationVO datasource) {
        this.datasource = datasource;
        return this;
    }

    public DimensionVO withDatasource(Consumer<BizDatasourceRelationVO> datasourceSetter) {
        if (this.datasource == null) {
            this.datasource = new BizDatasourceRelationVO();
            datasourceSetter.accept(this.datasource);
        }

        return this;
    }

    /**
     * Get datasource
     * @return datasource
     */
    public BizDatasourceRelationVO getDatasource() {
        return datasource;
    }

    public void setDatasource(BizDatasourceRelationVO datasource) {
        this.datasource = datasource;
    }

    public DimensionVO withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 资产责任人。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public DimensionVO withObsLocation(String obsLocation) {
        this.obsLocation = obsLocation;
        return this;
    }

    /**
     * 外表路径
     * @return obsLocation
     */
    public String getObsLocation() {
        return obsLocation;
    }

    public void setObsLocation(String obsLocation) {
        this.obsLocation = obsLocation;
    }

    public DimensionVO withTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }

    /**
     * 表类型。
     * @return tableType
     */
    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    public DimensionVO withDistribute(DistributeEnum distribute) {
        this.distribute = distribute;
        return this;
    }

    /**
     * DISTRIBUTE BY [HASH(column)|REPLICATION]。 枚举值：   - HASH: 对指定的列进行Hash，通过映射，把数据分布到指定DN   - REPLICATION: 表的每一行存在所有数据节点（DN）中，即每个数据节点都有完整的表数据 
     * @return distribute
     */
    public DistributeEnum getDistribute() {
        return distribute;
    }

    public void setDistribute(DistributeEnum distribute) {
        this.distribute = distribute;
    }

    public DimensionVO withDistributeColumn(String distributeColumn) {
        this.distributeColumn = distributeColumn;
        return this;
    }

    /**
     * DISTRIBUTE BY HASH column.
     * @return distributeColumn
     */
    public String getDistributeColumn() {
        return distributeColumn;
    }

    public void setDistributeColumn(String distributeColumn) {
        this.distributeColumn = distributeColumn;
    }

    public DimensionVO withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 别名。
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public DimensionVO withSelfDefinedFields(List<SelfDefinedFieldVO> selfDefinedFields) {
        this.selfDefinedFields = selfDefinedFields;
        return this;
    }

    public DimensionVO addSelfDefinedFieldsItem(SelfDefinedFieldVO selfDefinedFieldsItem) {
        if (this.selfDefinedFields == null) {
            this.selfDefinedFields = new ArrayList<>();
        }
        this.selfDefinedFields.add(selfDefinedFieldsItem);
        return this;
    }

    public DimensionVO withSelfDefinedFields(Consumer<List<SelfDefinedFieldVO>> selfDefinedFieldsSetter) {
        if (this.selfDefinedFields == null) {
            this.selfDefinedFields = new ArrayList<>();
        }
        selfDefinedFieldsSetter.accept(this.selfDefinedFields);
        return this;
    }

    /**
     * 自定义项。
     * @return selfDefinedFields
     */
    public List<SelfDefinedFieldVO> getSelfDefinedFields() {
        return selfDefinedFields;
    }

    public void setSelfDefinedFields(List<SelfDefinedFieldVO> selfDefinedFields) {
        this.selfDefinedFields = selfDefinedFields;
    }

    public DimensionVO withConfigs(String configs) {
        this.configs = configs;
        return this;
    }

    /**
     * 其他配置
     * @return configs
     */
    public String getConfigs() {
        return configs;
    }

    public void setConfigs(String configs) {
        this.configs = configs;
    }

    public DimensionVO withDevVersion(String devVersion) {
        this.devVersion = devVersion;
        return this;
    }

    /**
     * 开发环境版本，填写String类型替代Long类型。
     * @return devVersion
     */
    public String getDevVersion() {
        return devVersion;
    }

    public void setDevVersion(String devVersion) {
        this.devVersion = devVersion;
    }

    public DimensionVO withProdVersion(String prodVersion) {
        this.prodVersion = prodVersion;
        return this;
    }

    /**
     * 生产环境版本，填写String类型替代Long类型。
     * @return prodVersion
     */
    public String getProdVersion() {
        return prodVersion;
    }

    public void setProdVersion(String prodVersion) {
        this.prodVersion = prodVersion;
    }

    public DimensionVO withDevVersionName(String devVersionName) {
        this.devVersionName = devVersionName;
        return this;
    }

    /**
     * 开发环境版本名称
     * @return devVersionName
     */
    public String getDevVersionName() {
        return devVersionName;
    }

    public void setDevVersionName(String devVersionName) {
        this.devVersionName = devVersionName;
    }

    public DimensionVO withProdVersionName(String prodVersionName) {
        this.prodVersionName = prodVersionName;
        return this;
    }

    /**
     * 生产环境版本名称
     * @return prodVersionName
     */
    public String getProdVersionName() {
        return prodVersionName;
    }

    public void setProdVersionName(String prodVersionName) {
        this.prodVersionName = prodVersionName;
    }

    public DimensionVO withEnvType(EnvTypeEnum envType) {
        this.envType = envType;
        return this;
    }

    /**
     * Get envType
     * @return envType
     */
    public EnvTypeEnum getEnvType() {
        return envType;
    }

    public void setEnvType(EnvTypeEnum envType) {
        this.envType = envType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DimensionVO that = (DimensionVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.nameEn, that.nameEn)
            && Objects.equals(this.dimensionType, that.dimensionType) && Objects.equals(this.nameCh, that.nameCh)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createBy, that.createBy)
            && Objects.equals(this.updateBy, that.updateBy) && Objects.equals(this.codeTableId, that.codeTableId)
            && Objects.equals(this.codeTable, that.codeTable) && Objects.equals(this.l1Id, that.l1Id)
            && Objects.equals(this.l2Id, that.l2Id) && Objects.equals(this.l3Id, that.l3Id)
            && Objects.equals(this.hierarchies, that.hierarchies) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.approvalInfo, that.approvalInfo) && Objects.equals(this.newBiz, that.newBiz)
            && Objects.equals(this.l1, that.l1) && Objects.equals(this.l2, that.l2) && Objects.equals(this.l3, that.l3)
            && Objects.equals(this.attributes, that.attributes) && Objects.equals(this.mappings, that.mappings)
            && Objects.equals(this.datasource, that.datasource) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.obsLocation, that.obsLocation) && Objects.equals(this.tableType, that.tableType)
            && Objects.equals(this.distribute, that.distribute)
            && Objects.equals(this.distributeColumn, that.distributeColumn) && Objects.equals(this.alias, that.alias)
            && Objects.equals(this.selfDefinedFields, that.selfDefinedFields)
            && Objects.equals(this.configs, that.configs) && Objects.equals(this.devVersion, that.devVersion)
            && Objects.equals(this.prodVersion, that.prodVersion)
            && Objects.equals(this.devVersionName, that.devVersionName)
            && Objects.equals(this.prodVersionName, that.prodVersionName) && Objects.equals(this.envType, that.envType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            nameEn,
            dimensionType,
            nameCh,
            description,
            createBy,
            updateBy,
            codeTableId,
            codeTable,
            l1Id,
            l2Id,
            l3Id,
            hierarchies,
            status,
            createTime,
            updateTime,
            approvalInfo,
            newBiz,
            l1,
            l2,
            l3,
            attributes,
            mappings,
            datasource,
            owner,
            obsLocation,
            tableType,
            distribute,
            distributeColumn,
            alias,
            selfDefinedFields,
            configs,
            devVersion,
            prodVersion,
            devVersionName,
            prodVersionName,
            envType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DimensionVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    dimensionType: ").append(toIndentedString(dimensionType)).append("\n");
        sb.append("    nameCh: ").append(toIndentedString(nameCh)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    codeTableId: ").append(toIndentedString(codeTableId)).append("\n");
        sb.append("    codeTable: ").append(toIndentedString(codeTable)).append("\n");
        sb.append("    l1Id: ").append(toIndentedString(l1Id)).append("\n");
        sb.append("    l2Id: ").append(toIndentedString(l2Id)).append("\n");
        sb.append("    l3Id: ").append(toIndentedString(l3Id)).append("\n");
        sb.append("    hierarchies: ").append(toIndentedString(hierarchies)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    approvalInfo: ").append(toIndentedString(approvalInfo)).append("\n");
        sb.append("    newBiz: ").append(toIndentedString(newBiz)).append("\n");
        sb.append("    l1: ").append(toIndentedString(l1)).append("\n");
        sb.append("    l2: ").append(toIndentedString(l2)).append("\n");
        sb.append("    l3: ").append(toIndentedString(l3)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
        sb.append("    datasource: ").append(toIndentedString(datasource)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    obsLocation: ").append(toIndentedString(obsLocation)).append("\n");
        sb.append("    tableType: ").append(toIndentedString(tableType)).append("\n");
        sb.append("    distribute: ").append(toIndentedString(distribute)).append("\n");
        sb.append("    distributeColumn: ").append(toIndentedString(distributeColumn)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    selfDefinedFields: ").append(toIndentedString(selfDefinedFields)).append("\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
        sb.append("    devVersion: ").append(toIndentedString(devVersion)).append("\n");
        sb.append("    prodVersion: ").append(toIndentedString(prodVersion)).append("\n");
        sb.append("    devVersionName: ").append(toIndentedString(devVersionName)).append("\n");
        sb.append("    prodVersionName: ").append(toIndentedString(prodVersionName)).append("\n");
        sb.append("    envType: ").append(toIndentedString(envType)).append("\n");
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
