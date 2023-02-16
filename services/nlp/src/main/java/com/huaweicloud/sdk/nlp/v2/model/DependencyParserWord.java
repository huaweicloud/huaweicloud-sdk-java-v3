package com.huaweicloud.sdk.nlp.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 依存句法分析结果词汇单元结构体
 */
public class DependencyParserWord  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private Integer id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="word")
    
    
    private String word;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="head_word_id")
    
    
    private Integer headWordId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pos")
    
    
    private String pos;
    /**
     * 词与头节点的依存关系，包括以下几种类型 1.根节点root 根节点是指整个句子的谓语动词。 如：我/爱/妈妈(root->爱)。 2.同主语同宾语关系sasubj-obj  (same subject and object) 同主语同宾语关系是指句子中属于同一级且具有相同的主语和宾语的两个动词。 如：我/一直在/研究/和/思考/这个/问题/。(研究–>思考)。 3.同主语关系sasubj (same subject) 同主语关系是指句子中属于同一级且具有相同的主语中的两个动词。 如：我/走进/操场/打/篮球/。(走进–>打)。 4.不同主语关系dfsubj (different subject ) 不同主语关系是指句子中属于同一级且具有不同的主语的两个动词。 如：我/走进/操场/打/篮球/。(走进–>打)。 5.主语关系subj (subject) 主语关系是指动词的主语 如：我/爱/妈妈(我<-爱)。 6.主谓谓语中的内部主语关系subj-in (subject inside a subject-predicate predicate) 句子中一个主谓短语，是对主语动作或状态的陈述或说明时，那么就认为这个主谓短语整体作为谓语。 为了区分两个主语，里面那个主语的依存关系类型为subj-in，外面的主语的依存关系类型为subj。 如：他/确实/头/疼(头<–疼)。 7.宾语关系obj (object) 宾语是指谓语动词的承受对象，即受事。 如：我/爱/妈妈(爱->妈妈)。 8.谓语关系pred (predicate) 兼语结构句式一般有两个动词(V1+N+V2)，其中N 是V1 的宾语，同时又是V2 的主语，V2即为N的谓语。 如：命令 /他/扫地(他–>扫地)。 9.定语关系att (attribute) 定语关系是指定语和中心词之间的关系，定语对中心词起修饰或限制作用。 如：国家/主席(国家<–主席)。 10.状语关系adv (adverbial) 状语一般修饰谓语动词或形容词，状语在核心词的前面。 如：非常/喜欢(非常<–喜欢)。 11.补语关系cmp (complement) 补语一般修饰谓语动词或形容词，补语在核心词的后面（和状语相反）。 如：洗/干净/手(洗–>干净)。 12.并列关系coo (coordination ) 并列关系是指两个相同性质的词并列在一起。 如：鲜花/和/掌声(鲜花–>掌声)。 13.介宾关系pobj (preposition-object) 介词后面的名词或代词称为介词宾语。 如：在/家/看书(在–>家)。 14.间接宾语关系iobj (indirect-object) 有些动词可以同时支配两个宾语。为了区分，将第一个宾语称为间接宾语。 如：给/他/书(给–>他)。 15.“的”字关系de (de-construction) “的”字关系是指“的” 后面很明显应该有名词或代词，但被省略，此时“的”与前面的成分构成“的”字关系。 如：这/是/他/的(他<–的)。 16.附加关系adjct (adjunct) 附加关系是指一些句子中没有实际意义的、只是为了让句子结构完整、或者讲起来更有韵味（抑扬顿挫）的词语。 如：我/走/了(走–>了)。 17.称呼关系app (appellation) 称呼关系是指对人的称呼，主要是口语中的现象。 如：老师/，/你/好(老师<–好)。 18.进一步解释关系exp (explanation) 汉语书面语中，常常会使用括号在原本流畅的表达中，插入一些解释说明的话。括号中的内容如果是解释说明对应的词、或短语、或句子则为进一步解释关系。 如：普京/（/俄罗斯/总统/）(普京–>总统)。 19.标点关系punc (punctuation) 标点符号依存于其前面句子的核心词。 如：我/爱/妈妈(爱->。)。 20.片段关系frag (fragment) 片段关系是指汉语中不符合语法、支离破碎、病句的汉语句子。 如：你/，/我/，/中国/。(你–>我–>中国)。 21.重复关系repet (repetition) 重复关系是指汉语口语中出现说话结巴、重复称呼、表示强调等情况。 如：你 吃/，/吃/饭/了/吗/？(吃–>吃)。
     */
    public static final class DependencyLabelEnum {

        
        /**
         * Enum ROOT for value: "root"
         */
        public static final DependencyLabelEnum ROOT = new DependencyLabelEnum("root");
        
        /**
         * Enum SASUBJ_OBJ for value: "sasubj-obj"
         */
        public static final DependencyLabelEnum SASUBJ_OBJ = new DependencyLabelEnum("sasubj-obj");
        
        /**
         * Enum SASUBJ for value: "sasubj"
         */
        public static final DependencyLabelEnum SASUBJ = new DependencyLabelEnum("sasubj");
        
        /**
         * Enum DFSUBJ for value: "dfsubj"
         */
        public static final DependencyLabelEnum DFSUBJ = new DependencyLabelEnum("dfsubj");
        
        /**
         * Enum SUBJ for value: "subj"
         */
        public static final DependencyLabelEnum SUBJ = new DependencyLabelEnum("subj");
        
        /**
         * Enum SUBJ_IN for value: "subj-in"
         */
        public static final DependencyLabelEnum SUBJ_IN = new DependencyLabelEnum("subj-in");
        
        /**
         * Enum OBJ for value: "obj"
         */
        public static final DependencyLabelEnum OBJ = new DependencyLabelEnum("obj");
        
        /**
         * Enum PRED for value: "pred"
         */
        public static final DependencyLabelEnum PRED = new DependencyLabelEnum("pred");
        
        /**
         * Enum ATT for value: "att"
         */
        public static final DependencyLabelEnum ATT = new DependencyLabelEnum("att");
        
        /**
         * Enum ADV for value: "adv"
         */
        public static final DependencyLabelEnum ADV = new DependencyLabelEnum("adv");
        
        /**
         * Enum CMP for value: "cmp"
         */
        public static final DependencyLabelEnum CMP = new DependencyLabelEnum("cmp");
        
        /**
         * Enum COO for value: "coo"
         */
        public static final DependencyLabelEnum COO = new DependencyLabelEnum("coo");
        
        /**
         * Enum POBJ for value: "pobj"
         */
        public static final DependencyLabelEnum POBJ = new DependencyLabelEnum("pobj");
        
        /**
         * Enum IOBJ for value: "iobj"
         */
        public static final DependencyLabelEnum IOBJ = new DependencyLabelEnum("iobj");
        
        /**
         * Enum DE for value: "de"
         */
        public static final DependencyLabelEnum DE = new DependencyLabelEnum("de");
        
        /**
         * Enum ADJCT for value: "adjct"
         */
        public static final DependencyLabelEnum ADJCT = new DependencyLabelEnum("adjct");
        
        /**
         * Enum APP for value: "app"
         */
        public static final DependencyLabelEnum APP = new DependencyLabelEnum("app");
        
        /**
         * Enum EXP for value: "exp"
         */
        public static final DependencyLabelEnum EXP = new DependencyLabelEnum("exp");
        
        /**
         * Enum PUNC for value: "punc"
         */
        public static final DependencyLabelEnum PUNC = new DependencyLabelEnum("punc");
        
        /**
         * Enum FRAG for value: "frag"
         */
        public static final DependencyLabelEnum FRAG = new DependencyLabelEnum("frag");
        
        /**
         * Enum REPET for value: "repet"
         */
        public static final DependencyLabelEnum REPET = new DependencyLabelEnum("repet");
        

        private static final Map<String, DependencyLabelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DependencyLabelEnum> createStaticFields() {
            Map<String, DependencyLabelEnum> map = new HashMap<>();
            map.put("root", ROOT);
            map.put("sasubj-obj", SASUBJ_OBJ);
            map.put("sasubj", SASUBJ);
            map.put("dfsubj", DFSUBJ);
            map.put("subj", SUBJ);
            map.put("subj-in", SUBJ_IN);
            map.put("obj", OBJ);
            map.put("pred", PRED);
            map.put("att", ATT);
            map.put("adv", ADV);
            map.put("cmp", CMP);
            map.put("coo", COO);
            map.put("pobj", POBJ);
            map.put("iobj", IOBJ);
            map.put("de", DE);
            map.put("adjct", ADJCT);
            map.put("app", APP);
            map.put("exp", EXP);
            map.put("punc", PUNC);
            map.put("frag", FRAG);
            map.put("repet", REPET);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DependencyLabelEnum(String value) {
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
        public static DependencyLabelEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            DependencyLabelEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DependencyLabelEnum(value);
            }
            return result;
        }

        public static DependencyLabelEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DependencyLabelEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DependencyLabelEnum) {
                return this.value.equals(((DependencyLabelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dependency_label")
    
    
    private DependencyLabelEnum dependencyLabel;

    public DependencyParserWord withId(Integer id) {
        this.id = id;
        return this;
    }

    


    /**
     * 词汇id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public DependencyParserWord withWord(String word) {
        this.word = word;
        return this;
    }

    


    /**
     * 词汇内容
     * @return word
     */
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    

    public DependencyParserWord withHeadWordId(Integer headWordId) {
        this.headWordId = headWordId;
        return this;
    }

    


    /**
     * 头节点ID，根节点默认为0
     * @return headWordId
     */
    public Integer getHeadWordId() {
        return headWordId;
    }

    public void setHeadWordId(Integer headWordId) {
        this.headWordId = headWordId;
    }

    

    public DependencyParserWord withPos(String pos) {
        this.pos = pos;
        return this;
    }

    


    /**
     * 词性
     * @return pos
     */
    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    

    public DependencyParserWord withDependencyLabel(DependencyLabelEnum dependencyLabel) {
        this.dependencyLabel = dependencyLabel;
        return this;
    }

    


    /**
     * 词与头节点的依存关系，包括以下几种类型 1.根节点root 根节点是指整个句子的谓语动词。 如：我/爱/妈妈(root->爱)。 2.同主语同宾语关系sasubj-obj  (same subject and object) 同主语同宾语关系是指句子中属于同一级且具有相同的主语和宾语的两个动词。 如：我/一直在/研究/和/思考/这个/问题/。(研究–>思考)。 3.同主语关系sasubj (same subject) 同主语关系是指句子中属于同一级且具有相同的主语中的两个动词。 如：我/走进/操场/打/篮球/。(走进–>打)。 4.不同主语关系dfsubj (different subject ) 不同主语关系是指句子中属于同一级且具有不同的主语的两个动词。 如：我/走进/操场/打/篮球/。(走进–>打)。 5.主语关系subj (subject) 主语关系是指动词的主语 如：我/爱/妈妈(我<-爱)。 6.主谓谓语中的内部主语关系subj-in (subject inside a subject-predicate predicate) 句子中一个主谓短语，是对主语动作或状态的陈述或说明时，那么就认为这个主谓短语整体作为谓语。 为了区分两个主语，里面那个主语的依存关系类型为subj-in，外面的主语的依存关系类型为subj。 如：他/确实/头/疼(头<–疼)。 7.宾语关系obj (object) 宾语是指谓语动词的承受对象，即受事。 如：我/爱/妈妈(爱->妈妈)。 8.谓语关系pred (predicate) 兼语结构句式一般有两个动词(V1+N+V2)，其中N 是V1 的宾语，同时又是V2 的主语，V2即为N的谓语。 如：命令 /他/扫地(他–>扫地)。 9.定语关系att (attribute) 定语关系是指定语和中心词之间的关系，定语对中心词起修饰或限制作用。 如：国家/主席(国家<–主席)。 10.状语关系adv (adverbial) 状语一般修饰谓语动词或形容词，状语在核心词的前面。 如：非常/喜欢(非常<–喜欢)。 11.补语关系cmp (complement) 补语一般修饰谓语动词或形容词，补语在核心词的后面（和状语相反）。 如：洗/干净/手(洗–>干净)。 12.并列关系coo (coordination ) 并列关系是指两个相同性质的词并列在一起。 如：鲜花/和/掌声(鲜花–>掌声)。 13.介宾关系pobj (preposition-object) 介词后面的名词或代词称为介词宾语。 如：在/家/看书(在–>家)。 14.间接宾语关系iobj (indirect-object) 有些动词可以同时支配两个宾语。为了区分，将第一个宾语称为间接宾语。 如：给/他/书(给–>他)。 15.“的”字关系de (de-construction) “的”字关系是指“的” 后面很明显应该有名词或代词，但被省略，此时“的”与前面的成分构成“的”字关系。 如：这/是/他/的(他<–的)。 16.附加关系adjct (adjunct) 附加关系是指一些句子中没有实际意义的、只是为了让句子结构完整、或者讲起来更有韵味（抑扬顿挫）的词语。 如：我/走/了(走–>了)。 17.称呼关系app (appellation) 称呼关系是指对人的称呼，主要是口语中的现象。 如：老师/，/你/好(老师<–好)。 18.进一步解释关系exp (explanation) 汉语书面语中，常常会使用括号在原本流畅的表达中，插入一些解释说明的话。括号中的内容如果是解释说明对应的词、或短语、或句子则为进一步解释关系。 如：普京/（/俄罗斯/总统/）(普京–>总统)。 19.标点关系punc (punctuation) 标点符号依存于其前面句子的核心词。 如：我/爱/妈妈(爱->。)。 20.片段关系frag (fragment) 片段关系是指汉语中不符合语法、支离破碎、病句的汉语句子。 如：你/，/我/，/中国/。(你–>我–>中国)。 21.重复关系repet (repetition) 重复关系是指汉语口语中出现说话结巴、重复称呼、表示强调等情况。 如：你 吃/，/吃/饭/了/吗/？(吃–>吃)。
     * @return dependencyLabel
     */
    public DependencyLabelEnum getDependencyLabel() {
        return dependencyLabel;
    }

    public void setDependencyLabel(DependencyLabelEnum dependencyLabel) {
        this.dependencyLabel = dependencyLabel;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DependencyParserWord dependencyParserWord = (DependencyParserWord) o;
        return Objects.equals(this.id, dependencyParserWord.id) &&
            Objects.equals(this.word, dependencyParserWord.word) &&
            Objects.equals(this.headWordId, dependencyParserWord.headWordId) &&
            Objects.equals(this.pos, dependencyParserWord.pos) &&
            Objects.equals(this.dependencyLabel, dependencyParserWord.dependencyLabel);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, word, headWordId, pos, dependencyLabel);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependencyParserWord {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    word: ").append(toIndentedString(word)).append("\n");
        sb.append("    headWordId: ").append(toIndentedString(headWordId)).append("\n");
        sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
        sb.append("    dependencyLabel: ").append(toIndentedString(dependencyLabel)).append("\n");
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

