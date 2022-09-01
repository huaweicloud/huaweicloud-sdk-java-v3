package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * JobConfig
 */
public class JobConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nearline_recall_param")

    @JacksonXmlProperty(localName = "nearline_recall_param")

    private NearLineRecallParam nearlineRecallParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_recommended_num")

    @JacksonXmlProperty(localName = "max_recommended_num")

    private Integer maxRecommendedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_feature_pairs")

    @JacksonXmlProperty(localName = "match_feature_pairs")

    private List<MatchFeaturePair> matchFeaturePairs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "striping")

    @JacksonXmlProperty(localName = "striping")

    private Striping striping;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_type")

    @JacksonXmlProperty(localName = "match_type")

    private String matchType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matrix_factorization")

    @JacksonXmlProperty(localName = "matrix_factorization")

    private MatrixFactorization matrixFactorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "behavior_frequencys")

    @JacksonXmlProperty(localName = "behavior_frequencys")

    private List<BehaviorFrequency> behaviorFrequencys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    @JacksonXmlProperty(localName = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ucb_param")

    @JacksonXmlProperty(localName = "ucb_param")

    private UcbParam ucbParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "behavior_gravity")

    @JacksonXmlProperty(localName = "behavior_gravity")

    private BehaviorGravity behaviorGravity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    @JacksonXmlProperty(localName = "category")

    private Category category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "behavior_logic")

    @JacksonXmlProperty(localName = "behavior_logic")

    private String behaviorLogic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "features_engineering")

    @JacksonXmlProperty(localName = "features_engineering")

    private EtlBasicParameter featuresEngineering;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample_param")

    @JacksonXmlProperty(localName = "sample_param")

    private SampleParam sampleParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deep_learning_parameters")

    @JacksonXmlProperty(localName = "deep_learning_parameters")

    private DeepLearingParam deepLearningParameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_specify_parameters")

    @JacksonXmlProperty(localName = "algorithm_specify_parameters")

    private AlgorithmSpecifyParameters algorithmSpecifyParameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "load_widetable")

    @JacksonXmlProperty(localName = "load_widetable")

    private Boolean loadWidetable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "load_profile")

    @JacksonXmlProperty(localName = "load_profile")

    private Boolean loadProfile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "save_mode")

    @JacksonXmlProperty(localName = "save_mode")

    private String saveMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indicators")

    @JacksonXmlProperty(localName = "indicators")

    private List<Indicator> indicators = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offline_rank_job_name")

    @JacksonXmlProperty(localName = "offline_rank_job_name")

    private String offlineRankJobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_interval")

    @JacksonXmlProperty(localName = "update_interval")

    private Integer updateInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optimizer")

    @JacksonXmlProperty(localName = "optimizer")

    private Optimizer optimizer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flows")

    @JacksonXmlProperty(localName = "flows")

    private Flow flows;

    public JobConfig withNearlineRecallParam(NearLineRecallParam nearlineRecallParam) {
        this.nearlineRecallParam = nearlineRecallParam;
        return this;
    }

    public JobConfig withNearlineRecallParam(Consumer<NearLineRecallParam> nearlineRecallParamSetter) {
        if (this.nearlineRecallParam == null) {
            this.nearlineRecallParam = new NearLineRecallParam();
            nearlineRecallParamSetter.accept(this.nearlineRecallParam);
        }

        return this;
    }

    /**
     * Get nearlineRecallParam
     * @return nearlineRecallParam
     */
    public NearLineRecallParam getNearlineRecallParam() {
        return nearlineRecallParam;
    }

    public void setNearlineRecallParam(NearLineRecallParam nearlineRecallParam) {
        this.nearlineRecallParam = nearlineRecallParam;
    }

    public JobConfig withMaxRecommendedNum(Integer maxRecommendedNum) {
        this.maxRecommendedNum = maxRecommendedNum;
        return this;
    }

    /**
     * 最大候选集个数（所有召回作业需提供此参数）。
     * minimum: 1
     * maximum: 200
     * @return maxRecommendedNum
     */
    public Integer getMaxRecommendedNum() {
        return maxRecommendedNum;
    }

    public void setMaxRecommendedNum(Integer maxRecommendedNum) {
        this.maxRecommendedNum = maxRecommendedNum;
    }

    public JobConfig withMatchFeaturePairs(List<MatchFeaturePair> matchFeaturePairs) {
        this.matchFeaturePairs = matchFeaturePairs;
        return this;
    }

    public JobConfig addMatchFeaturePairsItem(MatchFeaturePair matchFeaturePairsItem) {
        if (this.matchFeaturePairs == null) {
            this.matchFeaturePairs = new ArrayList<>();
        }
        this.matchFeaturePairs.add(matchFeaturePairsItem);
        return this;
    }

    public JobConfig withMatchFeaturePairs(Consumer<List<MatchFeaturePair>> matchFeaturePairsSetter) {
        if (this.matchFeaturePairs == null) {
            this.matchFeaturePairs = new ArrayList<>();
        }
        matchFeaturePairsSetter.accept(this.matchFeaturePairs);
        return this;
    }

    /**
     * 匹配特征对（属性匹配召回作业需要提供此参数）。
     * @return matchFeaturePairs
     */
    public List<MatchFeaturePair> getMatchFeaturePairs() {
        return matchFeaturePairs;
    }

    public void setMatchFeaturePairs(List<MatchFeaturePair> matchFeaturePairs) {
        this.matchFeaturePairs = matchFeaturePairs;
    }

    public JobConfig withStriping(Striping striping) {
        this.striping = striping;
        return this;
    }

    public JobConfig withStriping(Consumer<Striping> stripingSetter) {
        if (this.striping == null) {
            this.striping = new Striping();
            stripingSetter.accept(this.striping);
        }

        return this;
    }

    /**
     * Get striping
     * @return striping
     */
    public Striping getStriping() {
        return striping;
    }

    public void setStriping(Striping striping) {
        this.striping = striping;
    }

    public JobConfig withMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }

    /**
     * 匹配类型（属性匹配召回作业需提供此参数）： - UI，基于用户推荐物品 - UU，基于用户推荐用户 - II，基于物品推荐物品 - IU，基于物品推荐用户
     * @return matchType
     */
    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public JobConfig withMatrixFactorization(MatrixFactorization matrixFactorization) {
        this.matrixFactorization = matrixFactorization;
        return this;
    }

    public JobConfig withMatrixFactorization(Consumer<MatrixFactorization> matrixFactorizationSetter) {
        if (this.matrixFactorization == null) {
            this.matrixFactorization = new MatrixFactorization();
            matrixFactorizationSetter.accept(this.matrixFactorization);
        }

        return this;
    }

    /**
     * Get matrixFactorization
     * @return matrixFactorization
     */
    public MatrixFactorization getMatrixFactorization() {
        return matrixFactorization;
    }

    public void setMatrixFactorization(MatrixFactorization matrixFactorization) {
        this.matrixFactorization = matrixFactorization;
    }

    public JobConfig withBehaviorFrequencys(List<BehaviorFrequency> behaviorFrequencys) {
        this.behaviorFrequencys = behaviorFrequencys;
        return this;
    }

    public JobConfig addBehaviorFrequencysItem(BehaviorFrequency behaviorFrequencysItem) {
        if (this.behaviorFrequencys == null) {
            this.behaviorFrequencys = new ArrayList<>();
        }
        this.behaviorFrequencys.add(behaviorFrequencysItem);
        return this;
    }

    public JobConfig withBehaviorFrequencys(Consumer<List<BehaviorFrequency>> behaviorFrequencysSetter) {
        if (this.behaviorFrequencys == null) {
            this.behaviorFrequencys = new ArrayList<>();
        }
        behaviorFrequencysSetter.accept(this.behaviorFrequencys);
        return this;
    }

    /**
     * 行为频率信息（历史行为记忆召回作业、历史行为过滤作业需提供此参数）。
     * @return behaviorFrequencys
     */
    public List<BehaviorFrequency> getBehaviorFrequencys() {
        return behaviorFrequencys;
    }

    public void setBehaviorFrequencys(List<BehaviorFrequency> behaviorFrequencys) {
        this.behaviorFrequencys = behaviorFrequencys;
    }

    public JobConfig withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * 文件路径（人工配置候选集作业需要提供此参数）。
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public JobConfig withUcbParam(UcbParam ucbParam) {
        this.ucbParam = ucbParam;
        return this;
    }

    public JobConfig withUcbParam(Consumer<UcbParam> ucbParamSetter) {
        if (this.ucbParam == null) {
            this.ucbParam = new UcbParam();
            ucbParamSetter.accept(this.ucbParam);
        }

        return this;
    }

    /**
     * Get ucbParam
     * @return ucbParam
     */
    public UcbParam getUcbParam() {
        return ucbParam;
    }

    public void setUcbParam(UcbParam ucbParam) {
        this.ucbParam = ucbParam;
    }

    public JobConfig withBehaviorGravity(BehaviorGravity behaviorGravity) {
        this.behaviorGravity = behaviorGravity;
        return this;
    }

    public JobConfig withBehaviorGravity(Consumer<BehaviorGravity> behaviorGravitySetter) {
        if (this.behaviorGravity == null) {
            this.behaviorGravity = new BehaviorGravity();
            behaviorGravitySetter.accept(this.behaviorGravity);
        }

        return this;
    }

    /**
     * Get behaviorGravity
     * @return behaviorGravity
     */
    public BehaviorGravity getBehaviorGravity() {
        return behaviorGravity;
    }

    public void setBehaviorGravity(BehaviorGravity behaviorGravity) {
        this.behaviorGravity = behaviorGravity;
    }

    public JobConfig withCategory(Category category) {
        this.category = category;
        return this;
    }

    public JobConfig withCategory(Consumer<Category> categorySetter) {
        if (this.category == null) {
            this.category = new Category();
            categorySetter.accept(this.category);
        }

        return this;
    }

    /**
     * Get category
     * @return category
     */
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public JobConfig withBehaviorLogic(String behaviorLogic) {
        this.behaviorLogic = behaviorLogic;
        return this;
    }

    /**
     * 行为逻辑过滤（历史行为过滤作业需提供此参数）： - AND，同时满足则过滤 - OR， 满足一个则过滤
     * @return behaviorLogic
     */
    public String getBehaviorLogic() {
        return behaviorLogic;
    }

    public void setBehaviorLogic(String behaviorLogic) {
        this.behaviorLogic = behaviorLogic;
    }

    public JobConfig withFeaturesEngineering(EtlBasicParameter featuresEngineering) {
        this.featuresEngineering = featuresEngineering;
        return this;
    }

    public JobConfig withFeaturesEngineering(Consumer<EtlBasicParameter> featuresEngineeringSetter) {
        if (this.featuresEngineering == null) {
            this.featuresEngineering = new EtlBasicParameter();
            featuresEngineeringSetter.accept(this.featuresEngineering);
        }

        return this;
    }

    /**
     * Get featuresEngineering
     * @return featuresEngineering
     */
    public EtlBasicParameter getFeaturesEngineering() {
        return featuresEngineering;
    }

    public void setFeaturesEngineering(EtlBasicParameter featuresEngineering) {
        this.featuresEngineering = featuresEngineering;
    }

    public JobConfig withSampleParam(SampleParam sampleParam) {
        this.sampleParam = sampleParam;
        return this;
    }

    public JobConfig withSampleParam(Consumer<SampleParam> sampleParamSetter) {
        if (this.sampleParam == null) {
            this.sampleParam = new SampleParam();
            sampleParamSetter.accept(this.sampleParam);
        }

        return this;
    }

    /**
     * Get sampleParam
     * @return sampleParam
     */
    public SampleParam getSampleParam() {
        return sampleParam;
    }

    public void setSampleParam(SampleParam sampleParam) {
        this.sampleParam = sampleParam;
    }

    public JobConfig withDeepLearningParameters(DeepLearingParam deepLearningParameters) {
        this.deepLearningParameters = deepLearningParameters;
        return this;
    }

    public JobConfig withDeepLearningParameters(Consumer<DeepLearingParam> deepLearningParametersSetter) {
        if (this.deepLearningParameters == null) {
            this.deepLearningParameters = new DeepLearingParam();
            deepLearningParametersSetter.accept(this.deepLearningParameters);
        }

        return this;
    }

    /**
     * Get deepLearningParameters
     * @return deepLearningParameters
     */
    public DeepLearingParam getDeepLearningParameters() {
        return deepLearningParameters;
    }

    public void setDeepLearningParameters(DeepLearingParam deepLearningParameters) {
        this.deepLearningParameters = deepLearningParameters;
    }

    public JobConfig withAlgorithmSpecifyParameters(AlgorithmSpecifyParameters algorithmSpecifyParameters) {
        this.algorithmSpecifyParameters = algorithmSpecifyParameters;
        return this;
    }

    public JobConfig withAlgorithmSpecifyParameters(
        Consumer<AlgorithmSpecifyParameters> algorithmSpecifyParametersSetter) {
        if (this.algorithmSpecifyParameters == null) {
            this.algorithmSpecifyParameters = new AlgorithmSpecifyParameters();
            algorithmSpecifyParametersSetter.accept(this.algorithmSpecifyParameters);
        }

        return this;
    }

    /**
     * Get algorithmSpecifyParameters
     * @return algorithmSpecifyParameters
     */
    public AlgorithmSpecifyParameters getAlgorithmSpecifyParameters() {
        return algorithmSpecifyParameters;
    }

    public void setAlgorithmSpecifyParameters(AlgorithmSpecifyParameters algorithmSpecifyParameters) {
        this.algorithmSpecifyParameters = algorithmSpecifyParameters;
    }

    public JobConfig withLoadWidetable(Boolean loadWidetable) {
        this.loadWidetable = loadWidetable;
        return this;
    }

    /**
     * 导入宽表（离线数据导入作业需要提供此参数）。
     * @return loadWidetable
     */
    public Boolean getLoadWidetable() {
        return loadWidetable;
    }

    public void setLoadWidetable(Boolean loadWidetable) {
        this.loadWidetable = loadWidetable;
    }

    public JobConfig withLoadProfile(Boolean loadProfile) {
        this.loadProfile = loadProfile;
        return this;
    }

    /**
     * 导入画像（离线数据导入作业需要提供此参数）。
     * @return loadProfile
     */
    public Boolean getLoadProfile() {
        return loadProfile;
    }

    public void setLoadProfile(Boolean loadProfile) {
        this.loadProfile = loadProfile;
    }

    public JobConfig withSaveMode(String saveMode) {
        this.saveMode = saveMode;
        return this;
    }

    /**
     * 保留已有宽表（离线数据导入作业需要提供此参数）： - append，是 - new，否 - overwirte，覆盖
     * @return saveMode
     */
    public String getSaveMode() {
        return saveMode;
    }

    public void setSaveMode(String saveMode) {
        this.saveMode = saveMode;
    }

    public JobConfig withIndicators(List<Indicator> indicators) {
        this.indicators = indicators;
        return this;
    }

    public JobConfig addIndicatorsItem(Indicator indicatorsItem) {
        if (this.indicators == null) {
            this.indicators = new ArrayList<>();
        }
        this.indicators.add(indicatorsItem);
        return this;
    }

    public JobConfig withIndicators(Consumer<List<Indicator>> indicatorsSetter) {
        if (this.indicators == null) {
            this.indicators = new ArrayList<>();
        }
        indicatorsSetter.accept(this.indicators);
        return this;
    }

    /**
     * 统计指标（效果评估作业需要提供此参数）。
     * @return indicators
     */
    public List<Indicator> getIndicators() {
        return indicators;
    }

    public void setIndicators(List<Indicator> indicators) {
        this.indicators = indicators;
    }

    public JobConfig withOfflineRankJobName(String offlineRankJobName) {
        this.offlineRankJobName = offlineRankJobName;
        return this;
    }

    /**
     * 离线排序作业名称（在线训练任务需要提供此参数）。
     * @return offlineRankJobName
     */
    public String getOfflineRankJobName() {
        return offlineRankJobName;
    }

    public void setOfflineRankJobName(String offlineRankJobName) {
        this.offlineRankJobName = offlineRankJobName;
    }

    public JobConfig withUpdateInterval(Integer updateInterval) {
        this.updateInterval = updateInterval;
        return this;
    }

    /**
     * 更新周期（在线训练任务需要提供此参数）。
     * @return updateInterval
     */
    public Integer getUpdateInterval() {
        return updateInterval;
    }

    public void setUpdateInterval(Integer updateInterval) {
        this.updateInterval = updateInterval;
    }

    public JobConfig withOptimizer(Optimizer optimizer) {
        this.optimizer = optimizer;
        return this;
    }

    public JobConfig withOptimizer(Consumer<Optimizer> optimizerSetter) {
        if (this.optimizer == null) {
            this.optimizer = new Optimizer();
            optimizerSetter.accept(this.optimizer);
        }

        return this;
    }

    /**
     * Get optimizer
     * @return optimizer
     */
    public Optimizer getOptimizer() {
        return optimizer;
    }

    public void setOptimizer(Optimizer optimizer) {
        this.optimizer = optimizer;
    }

    public JobConfig withFlows(Flow flows) {
        this.flows = flows;
        return this;
    }

    public JobConfig withFlows(Consumer<Flow> flowsSetter) {
        if (this.flows == null) {
            this.flows = new Flow();
            flowsSetter.accept(this.flows);
        }

        return this;
    }

    /**
     * Get flows
     * @return flows
     */
    public Flow getFlows() {
        return flows;
    }

    public void setFlows(Flow flows) {
        this.flows = flows;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobConfig jobConfig = (JobConfig) o;
        return Objects.equals(this.nearlineRecallParam, jobConfig.nearlineRecallParam)
            && Objects.equals(this.maxRecommendedNum, jobConfig.maxRecommendedNum)
            && Objects.equals(this.matchFeaturePairs, jobConfig.matchFeaturePairs)
            && Objects.equals(this.striping, jobConfig.striping) && Objects.equals(this.matchType, jobConfig.matchType)
            && Objects.equals(this.matrixFactorization, jobConfig.matrixFactorization)
            && Objects.equals(this.behaviorFrequencys, jobConfig.behaviorFrequencys)
            && Objects.equals(this.filePath, jobConfig.filePath) && Objects.equals(this.ucbParam, jobConfig.ucbParam)
            && Objects.equals(this.behaviorGravity, jobConfig.behaviorGravity)
            && Objects.equals(this.category, jobConfig.category)
            && Objects.equals(this.behaviorLogic, jobConfig.behaviorLogic)
            && Objects.equals(this.featuresEngineering, jobConfig.featuresEngineering)
            && Objects.equals(this.sampleParam, jobConfig.sampleParam)
            && Objects.equals(this.deepLearningParameters, jobConfig.deepLearningParameters)
            && Objects.equals(this.algorithmSpecifyParameters, jobConfig.algorithmSpecifyParameters)
            && Objects.equals(this.loadWidetable, jobConfig.loadWidetable)
            && Objects.equals(this.loadProfile, jobConfig.loadProfile)
            && Objects.equals(this.saveMode, jobConfig.saveMode)
            && Objects.equals(this.indicators, jobConfig.indicators)
            && Objects.equals(this.offlineRankJobName, jobConfig.offlineRankJobName)
            && Objects.equals(this.updateInterval, jobConfig.updateInterval)
            && Objects.equals(this.optimizer, jobConfig.optimizer) && Objects.equals(this.flows, jobConfig.flows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nearlineRecallParam,
            maxRecommendedNum,
            matchFeaturePairs,
            striping,
            matchType,
            matrixFactorization,
            behaviorFrequencys,
            filePath,
            ucbParam,
            behaviorGravity,
            category,
            behaviorLogic,
            featuresEngineering,
            sampleParam,
            deepLearningParameters,
            algorithmSpecifyParameters,
            loadWidetable,
            loadProfile,
            saveMode,
            indicators,
            offlineRankJobName,
            updateInterval,
            optimizer,
            flows);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobConfig {\n");
        sb.append("    nearlineRecallParam: ").append(toIndentedString(nearlineRecallParam)).append("\n");
        sb.append("    maxRecommendedNum: ").append(toIndentedString(maxRecommendedNum)).append("\n");
        sb.append("    matchFeaturePairs: ").append(toIndentedString(matchFeaturePairs)).append("\n");
        sb.append("    striping: ").append(toIndentedString(striping)).append("\n");
        sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
        sb.append("    matrixFactorization: ").append(toIndentedString(matrixFactorization)).append("\n");
        sb.append("    behaviorFrequencys: ").append(toIndentedString(behaviorFrequencys)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    ucbParam: ").append(toIndentedString(ucbParam)).append("\n");
        sb.append("    behaviorGravity: ").append(toIndentedString(behaviorGravity)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    behaviorLogic: ").append(toIndentedString(behaviorLogic)).append("\n");
        sb.append("    featuresEngineering: ").append(toIndentedString(featuresEngineering)).append("\n");
        sb.append("    sampleParam: ").append(toIndentedString(sampleParam)).append("\n");
        sb.append("    deepLearningParameters: ").append(toIndentedString(deepLearningParameters)).append("\n");
        sb.append("    algorithmSpecifyParameters: ").append(toIndentedString(algorithmSpecifyParameters)).append("\n");
        sb.append("    loadWidetable: ").append(toIndentedString(loadWidetable)).append("\n");
        sb.append("    loadProfile: ").append(toIndentedString(loadProfile)).append("\n");
        sb.append("    saveMode: ").append(toIndentedString(saveMode)).append("\n");
        sb.append("    indicators: ").append(toIndentedString(indicators)).append("\n");
        sb.append("    offlineRankJobName: ").append(toIndentedString(offlineRankJobName)).append("\n");
        sb.append("    updateInterval: ").append(toIndentedString(updateInterval)).append("\n");
        sb.append("    optimizer: ").append(toIndentedString(optimizer)).append("\n");
        sb.append("    flows: ").append(toIndentedString(flows)).append("\n");
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
