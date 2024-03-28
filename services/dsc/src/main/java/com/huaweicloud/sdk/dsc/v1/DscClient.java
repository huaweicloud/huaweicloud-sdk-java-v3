package com.huaweicloud.sdk.dsc.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dsc.v1.model.AddBucketsRequest;
import com.huaweicloud.sdk.dsc.v1.model.AddBucketsResponse;
import com.huaweicloud.sdk.dsc.v1.model.AddRuleGroupRequest;
import com.huaweicloud.sdk.dsc.v1.model.AddRuleGroupResponse;
import com.huaweicloud.sdk.dsc.v1.model.AddRuleRequest;
import com.huaweicloud.sdk.dsc.v1.model.AddRuleResponse;
import com.huaweicloud.sdk.dsc.v1.model.AddScanJobRequest;
import com.huaweicloud.sdk.dsc.v1.model.AddScanJobResponse;
import com.huaweicloud.sdk.dsc.v1.model.BatchAddDataMaskRequest;
import com.huaweicloud.sdk.dsc.v1.model.BatchAddDataMaskResponse;
import com.huaweicloud.sdk.dsc.v1.model.ChangeDbTemplateOperationRequest;
import com.huaweicloud.sdk.dsc.v1.model.ChangeDbTemplateOperationResponse;
import com.huaweicloud.sdk.dsc.v1.model.ChangeRuleRequest;
import com.huaweicloud.sdk.dsc.v1.model.ChangeRuleResponse;
import com.huaweicloud.sdk.dsc.v1.model.CreateDatabaseWaterMarkRequest;
import com.huaweicloud.sdk.dsc.v1.model.CreateDatabaseWaterMarkResponse;
import com.huaweicloud.sdk.dsc.v1.model.CreateDocWatermarkByAddressRequest;
import com.huaweicloud.sdk.dsc.v1.model.CreateDocWatermarkByAddressResponse;
import com.huaweicloud.sdk.dsc.v1.model.CreateDocWatermarkRequest;
import com.huaweicloud.sdk.dsc.v1.model.CreateDocWatermarkResponse;
import com.huaweicloud.sdk.dsc.v1.model.CreateImageWatermarkByAddressRequest;
import com.huaweicloud.sdk.dsc.v1.model.CreateImageWatermarkByAddressResponse;
import com.huaweicloud.sdk.dsc.v1.model.CreateImageWatermarkRequest;
import com.huaweicloud.sdk.dsc.v1.model.CreateImageWatermarkResponse;
import com.huaweicloud.sdk.dsc.v1.model.CreateProductOrderRequest;
import com.huaweicloud.sdk.dsc.v1.model.CreateProductOrderResponse;
import com.huaweicloud.sdk.dsc.v1.model.DeleteBucketRequest;
import com.huaweicloud.sdk.dsc.v1.model.DeleteBucketResponse;
import com.huaweicloud.sdk.dsc.v1.model.DeleteRuleGroupRequest;
import com.huaweicloud.sdk.dsc.v1.model.DeleteRuleGroupResponse;
import com.huaweicloud.sdk.dsc.v1.model.DeleteRuleRequest;
import com.huaweicloud.sdk.dsc.v1.model.DeleteRuleResponse;
import com.huaweicloud.sdk.dsc.v1.model.DeleteScanJobRequest;
import com.huaweicloud.sdk.dsc.v1.model.DeleteScanJobResponse;
import com.huaweicloud.sdk.dsc.v1.model.ListBucketsRequest;
import com.huaweicloud.sdk.dsc.v1.model.ListBucketsResponse;
import com.huaweicloud.sdk.dsc.v1.model.ListDbMaskTaskRequest;
import com.huaweicloud.sdk.dsc.v1.model.ListDbMaskTaskResponse;
import com.huaweicloud.sdk.dsc.v1.model.ListRuleGroupsRequest;
import com.huaweicloud.sdk.dsc.v1.model.ListRuleGroupsResponse;
import com.huaweicloud.sdk.dsc.v1.model.ShowDatabaseWaterMarkRequest;
import com.huaweicloud.sdk.dsc.v1.model.ShowDatabaseWaterMarkResponse;
import com.huaweicloud.sdk.dsc.v1.model.ShowDocWatermarkByAddressRequest;
import com.huaweicloud.sdk.dsc.v1.model.ShowDocWatermarkByAddressResponse;
import com.huaweicloud.sdk.dsc.v1.model.ShowDocWatermarkRequest;
import com.huaweicloud.sdk.dsc.v1.model.ShowDocWatermarkResponse;
import com.huaweicloud.sdk.dsc.v1.model.ShowImageWatermarkByAddressRequest;
import com.huaweicloud.sdk.dsc.v1.model.ShowImageWatermarkByAddressResponse;
import com.huaweicloud.sdk.dsc.v1.model.ShowImageWatermarkRequest;
import com.huaweicloud.sdk.dsc.v1.model.ShowImageWatermarkResponse;
import com.huaweicloud.sdk.dsc.v1.model.ShowImageWatermarkWithImageByAddressRequest;
import com.huaweicloud.sdk.dsc.v1.model.ShowImageWatermarkWithImageByAddressResponse;
import com.huaweicloud.sdk.dsc.v1.model.ShowImageWatermarkWithImageRequest;
import com.huaweicloud.sdk.dsc.v1.model.ShowImageWatermarkWithImageResponse;
import com.huaweicloud.sdk.dsc.v1.model.ShowOpenApiCalledRecordsRequest;
import com.huaweicloud.sdk.dsc.v1.model.ShowOpenApiCalledRecordsResponse;
import com.huaweicloud.sdk.dsc.v1.model.ShowRulesRequest;
import com.huaweicloud.sdk.dsc.v1.model.ShowRulesResponse;
import com.huaweicloud.sdk.dsc.v1.model.ShowScanJobResultsRequest;
import com.huaweicloud.sdk.dsc.v1.model.ShowScanJobResultsResponse;
import com.huaweicloud.sdk.dsc.v1.model.ShowScanJobsRequest;
import com.huaweicloud.sdk.dsc.v1.model.ShowScanJobsResponse;
import com.huaweicloud.sdk.dsc.v1.model.ShowSpecificationRequest;
import com.huaweicloud.sdk.dsc.v1.model.ShowSpecificationResponse;
import com.huaweicloud.sdk.dsc.v1.model.ShowTopicsRequest;
import com.huaweicloud.sdk.dsc.v1.model.ShowTopicsResponse;
import com.huaweicloud.sdk.dsc.v1.model.UpdateAssetNameRequest;
import com.huaweicloud.sdk.dsc.v1.model.UpdateAssetNameResponse;
import com.huaweicloud.sdk.dsc.v1.model.UpdateDefaultTopicRequest;
import com.huaweicloud.sdk.dsc.v1.model.UpdateDefaultTopicResponse;

public class DscClient {

    protected HcClient hcClient;

    public DscClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DscClient> newBuilder() {
        ClientBuilder<DscClient> clientBuilder = new ClientBuilder<>(DscClient::new);
        return clientBuilder;
    }

    /**
     * 添加资产授权
     *
     * 添加数据资产扫描授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddBucketsRequest 请求对象
     * @return AddBucketsResponse
     */
    public AddBucketsResponse addBuckets(AddBucketsRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.addBuckets);
    }

    /**
     * 添加资产授权
     *
     * 添加数据资产扫描授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddBucketsRequest 请求对象
     * @return SyncInvoker<AddBucketsRequest, AddBucketsResponse>
     */
    public SyncInvoker<AddBucketsRequest, AddBucketsResponse> addBucketsInvoker(AddBucketsRequest request) {
        return new SyncInvoker<>(request, DscMeta.addBuckets, hcClient);
    }

    /**
     * 创建扫描规则
     *
     * 根据指定的规则名称、规则类型、风险等级、最小匹配次数等参数创建自定义的敏感数据识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRuleRequest 请求对象
     * @return AddRuleResponse
     */
    public AddRuleResponse addRule(AddRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.addRule);
    }

    /**
     * 创建扫描规则
     *
     * 根据指定的规则名称、规则类型、风险等级、最小匹配次数等参数创建自定义的敏感数据识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRuleRequest 请求对象
     * @return SyncInvoker<AddRuleRequest, AddRuleResponse>
     */
    public SyncInvoker<AddRuleRequest, AddRuleResponse> addRuleInvoker(AddRuleRequest request) {
        return new SyncInvoker<>(request, DscMeta.addRule, hcClient);
    }

    /**
     * 创建扫描规则组
     *
     * 根据指定的规则组名称和扫描规则列表创建敏感数据扫描规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRuleGroupRequest 请求对象
     * @return AddRuleGroupResponse
     */
    public AddRuleGroupResponse addRuleGroup(AddRuleGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.addRuleGroup);
    }

    /**
     * 创建扫描规则组
     *
     * 根据指定的规则组名称和扫描规则列表创建敏感数据扫描规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRuleGroupRequest 请求对象
     * @return SyncInvoker<AddRuleGroupRequest, AddRuleGroupResponse>
     */
    public SyncInvoker<AddRuleGroupRequest, AddRuleGroupResponse> addRuleGroupInvoker(AddRuleGroupRequest request) {
        return new SyncInvoker<>(request, DscMeta.addRuleGroup, hcClient);
    }

    /**
     * 创建扫描任务
     *
     * 根据指定的任务名称、扫描方式、扫描周期、扫描规则组、扫描时间创建扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddScanJobRequest 请求对象
     * @return AddScanJobResponse
     */
    public AddScanJobResponse addScanJob(AddScanJobRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.addScanJob);
    }

    /**
     * 创建扫描任务
     *
     * 根据指定的任务名称、扫描方式、扫描周期、扫描规则组、扫描时间创建扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddScanJobRequest 请求对象
     * @return SyncInvoker<AddScanJobRequest, AddScanJobResponse>
     */
    public SyncInvoker<AddScanJobRequest, AddScanJobResponse> addScanJobInvoker(AddScanJobRequest request) {
        return new SyncInvoker<>(request, DscMeta.addScanJob, hcClient);
    }

    /**
     * 对数据进行脱敏
     *
     * 对数据进行脱敏
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddDataMaskRequest 请求对象
     * @return BatchAddDataMaskResponse
     */
    public BatchAddDataMaskResponse batchAddDataMask(BatchAddDataMaskRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.batchAddDataMask);
    }

    /**
     * 对数据进行脱敏
     *
     * 对数据进行脱敏
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddDataMaskRequest 请求对象
     * @return SyncInvoker<BatchAddDataMaskRequest, BatchAddDataMaskResponse>
     */
    public SyncInvoker<BatchAddDataMaskRequest, BatchAddDataMaskResponse> batchAddDataMaskInvoker(
        BatchAddDataMaskRequest request) {
        return new SyncInvoker<>(request, DscMeta.batchAddDataMask, hcClient);
    }

    /**
     * 开启/停止脱敏任务
     *
     * 开启/停止脱敏任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDbTemplateOperationRequest 请求对象
     * @return ChangeDbTemplateOperationResponse
     */
    public ChangeDbTemplateOperationResponse changeDbTemplateOperation(ChangeDbTemplateOperationRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.changeDbTemplateOperation);
    }

    /**
     * 开启/停止脱敏任务
     *
     * 开启/停止脱敏任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDbTemplateOperationRequest 请求对象
     * @return SyncInvoker<ChangeDbTemplateOperationRequest, ChangeDbTemplateOperationResponse>
     */
    public SyncInvoker<ChangeDbTemplateOperationRequest, ChangeDbTemplateOperationResponse> changeDbTemplateOperationInvoker(
        ChangeDbTemplateOperationRequest request) {
        return new SyncInvoker<>(request, DscMeta.changeDbTemplateOperation, hcClient);
    }

    /**
     * 修改扫描规则
     *
     * 修改自定义的敏感数据识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeRuleRequest 请求对象
     * @return ChangeRuleResponse
     */
    public ChangeRuleResponse changeRule(ChangeRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.changeRule);
    }

    /**
     * 修改扫描规则
     *
     * 修改自定义的敏感数据识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeRuleRequest 请求对象
     * @return SyncInvoker<ChangeRuleRequest, ChangeRuleResponse>
     */
    public SyncInvoker<ChangeRuleRequest, ChangeRuleResponse> changeRuleInvoker(ChangeRuleRequest request) {
        return new SyncInvoker<>(request, DscMeta.changeRule, hcClient);
    }

    /**
     * 嵌入数据水印
     *
     * 对json体中数据动态添加水印
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseWaterMarkRequest 请求对象
     * @return CreateDatabaseWaterMarkResponse
     */
    public CreateDatabaseWaterMarkResponse createDatabaseWaterMark(CreateDatabaseWaterMarkRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.createDatabaseWaterMark);
    }

    /**
     * 嵌入数据水印
     *
     * 对json体中数据动态添加水印
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseWaterMarkRequest 请求对象
     * @return SyncInvoker<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse>
     */
    public SyncInvoker<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse> createDatabaseWaterMarkInvoker(
        CreateDatabaseWaterMarkRequest request) {
        return new SyncInvoker<>(request, DscMeta.createDatabaseWaterMark, hcClient);
    }

    /**
     * 文档嵌入水印
     *
     * 对WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf) 类型的文件嵌入文字暗水印、文字明水印或者图片明水印，用户以formData的格式传入待加水印的文件和水印相关信息，DSC服务给文件加完水印后返回给用户已嵌入水印的文件的二进制流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDocWatermarkRequest 请求对象
     * @return CreateDocWatermarkResponse
     */
    public CreateDocWatermarkResponse createDocWatermark(CreateDocWatermarkRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.createDocWatermark);
    }

    /**
     * 文档嵌入水印
     *
     * 对WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf) 类型的文件嵌入文字暗水印、文字明水印或者图片明水印，用户以formData的格式传入待加水印的文件和水印相关信息，DSC服务给文件加完水印后返回给用户已嵌入水印的文件的二进制流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDocWatermarkRequest 请求对象
     * @return SyncInvoker<CreateDocWatermarkRequest, CreateDocWatermarkResponse>
     */
    public SyncInvoker<CreateDocWatermarkRequest, CreateDocWatermarkResponse> createDocWatermarkInvoker(
        CreateDocWatermarkRequest request) {
        return new SyncInvoker<>(request, DscMeta.createDocWatermark, hcClient);
    }

    /**
     * 文档嵌入水印（文件地址版本）
     *
     * 对WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)*类型的文档嵌入文字暗水印、文字明水印或者图片明水印，用户传入待加水印的文档地址（目前支持OBS)和水印相关信息，DSC服务对文档加完水印后返回给用户已嵌入水印的文档的存放地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDocWatermarkByAddressRequest 请求对象
     * @return CreateDocWatermarkByAddressResponse
     */
    public CreateDocWatermarkByAddressResponse createDocWatermarkByAddress(CreateDocWatermarkByAddressRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.createDocWatermarkByAddress);
    }

    /**
     * 文档嵌入水印（文件地址版本）
     *
     * 对WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)*类型的文档嵌入文字暗水印、文字明水印或者图片明水印，用户传入待加水印的文档地址（目前支持OBS)和水印相关信息，DSC服务对文档加完水印后返回给用户已嵌入水印的文档的存放地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDocWatermarkByAddressRequest 请求对象
     * @return SyncInvoker<CreateDocWatermarkByAddressRequest, CreateDocWatermarkByAddressResponse>
     */
    public SyncInvoker<CreateDocWatermarkByAddressRequest, CreateDocWatermarkByAddressResponse> createDocWatermarkByAddressInvoker(
        CreateDocWatermarkByAddressRequest request) {
        return new SyncInvoker<>(request, DscMeta.createDocWatermarkByAddress, hcClient);
    }

    /**
     * 图片嵌入暗水印
     *
     * 对图片嵌入文字暗水印或者图片暗水印，用户以formData的格式传入待加水印图片和水印相关信息，DSC服务对图片加完水印后返回给用户已嵌入水印的图片二进制流，目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageWatermarkRequest 请求对象
     * @return CreateImageWatermarkResponse
     */
    public CreateImageWatermarkResponse createImageWatermark(CreateImageWatermarkRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.createImageWatermark);
    }

    /**
     * 图片嵌入暗水印
     *
     * 对图片嵌入文字暗水印或者图片暗水印，用户以formData的格式传入待加水印图片和水印相关信息，DSC服务对图片加完水印后返回给用户已嵌入水印的图片二进制流，目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageWatermarkRequest 请求对象
     * @return SyncInvoker<CreateImageWatermarkRequest, CreateImageWatermarkResponse>
     */
    public SyncInvoker<CreateImageWatermarkRequest, CreateImageWatermarkResponse> createImageWatermarkInvoker(
        CreateImageWatermarkRequest request) {
        return new SyncInvoker<>(request, DscMeta.createImageWatermark, hcClient);
    }

    /**
     * 图片嵌入暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的图片嵌入文字暗水印或者图片暗水印，已嵌入的水印的图片将存放在用户指定的位置（目前支持华为云OBS），支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageWatermarkByAddressRequest 请求对象
     * @return CreateImageWatermarkByAddressResponse
     */
    public CreateImageWatermarkByAddressResponse createImageWatermarkByAddress(
        CreateImageWatermarkByAddressRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.createImageWatermarkByAddress);
    }

    /**
     * 图片嵌入暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的图片嵌入文字暗水印或者图片暗水印，已嵌入的水印的图片将存放在用户指定的位置（目前支持华为云OBS），支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageWatermarkByAddressRequest 请求对象
     * @return SyncInvoker<CreateImageWatermarkByAddressRequest, CreateImageWatermarkByAddressResponse>
     */
    public SyncInvoker<CreateImageWatermarkByAddressRequest, CreateImageWatermarkByAddressResponse> createImageWatermarkByAddressInvoker(
        CreateImageWatermarkByAddressRequest request) {
        return new SyncInvoker<>(request, DscMeta.createImageWatermarkByAddress, hcClient);
    }

    /**
     * 实例下单
     *
     * 根据计费方式、计费周期等信息进行实例下单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProductOrderRequest 请求对象
     * @return CreateProductOrderResponse
     */
    public CreateProductOrderResponse createProductOrder(CreateProductOrderRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.createProductOrder);
    }

    /**
     * 实例下单
     *
     * 根据计费方式、计费周期等信息进行实例下单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProductOrderRequest 请求对象
     * @return SyncInvoker<CreateProductOrderRequest, CreateProductOrderResponse>
     */
    public SyncInvoker<CreateProductOrderRequest, CreateProductOrderResponse> createProductOrderInvoker(
        CreateProductOrderRequest request) {
        return new SyncInvoker<>(request, DscMeta.createProductOrder, hcClient);
    }

    /**
     * 删除资产授权
     *
     * 删除数据资产扫描授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBucketRequest 请求对象
     * @return DeleteBucketResponse
     */
    public DeleteBucketResponse deleteBucket(DeleteBucketRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.deleteBucket);
    }

    /**
     * 删除资产授权
     *
     * 删除数据资产扫描授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBucketRequest 请求对象
     * @return SyncInvoker<DeleteBucketRequest, DeleteBucketResponse>
     */
    public SyncInvoker<DeleteBucketRequest, DeleteBucketResponse> deleteBucketInvoker(DeleteBucketRequest request) {
        return new SyncInvoker<>(request, DscMeta.deleteBucket, hcClient);
    }

    /**
     * 删除扫描规则
     *
     * 删除指定的敏感数据识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRuleRequest 请求对象
     * @return DeleteRuleResponse
     */
    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.deleteRule);
    }

    /**
     * 删除扫描规则
     *
     * 删除指定的敏感数据识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRuleRequest 请求对象
     * @return SyncInvoker<DeleteRuleRequest, DeleteRuleResponse>
     */
    public SyncInvoker<DeleteRuleRequest, DeleteRuleResponse> deleteRuleInvoker(DeleteRuleRequest request) {
        return new SyncInvoker<>(request, DscMeta.deleteRule, hcClient);
    }

    /**
     * 删除扫描规则组
     *
     * 根据扫描规则组ID删除指定的扫描规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRuleGroupRequest 请求对象
     * @return DeleteRuleGroupResponse
     */
    public DeleteRuleGroupResponse deleteRuleGroup(DeleteRuleGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.deleteRuleGroup);
    }

    /**
     * 删除扫描规则组
     *
     * 根据扫描规则组ID删除指定的扫描规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRuleGroupRequest 请求对象
     * @return SyncInvoker<DeleteRuleGroupRequest, DeleteRuleGroupResponse>
     */
    public SyncInvoker<DeleteRuleGroupRequest, DeleteRuleGroupResponse> deleteRuleGroupInvoker(
        DeleteRuleGroupRequest request) {
        return new SyncInvoker<>(request, DscMeta.deleteRuleGroup, hcClient);
    }

    /**
     * 删除扫描任务
     *
     * 删除扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScanJobRequest 请求对象
     * @return DeleteScanJobResponse
     */
    public DeleteScanJobResponse deleteScanJob(DeleteScanJobRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.deleteScanJob);
    }

    /**
     * 删除扫描任务
     *
     * 删除扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScanJobRequest 请求对象
     * @return SyncInvoker<DeleteScanJobRequest, DeleteScanJobResponse>
     */
    public SyncInvoker<DeleteScanJobRequest, DeleteScanJobResponse> deleteScanJobInvoker(DeleteScanJobRequest request) {
        return new SyncInvoker<>(request, DscMeta.deleteScanJob, hcClient);
    }

    /**
     * 查看资产列表
     *
     * 查询数据资产扫描授权列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBucketsRequest 请求对象
     * @return ListBucketsResponse
     */
    public ListBucketsResponse listBuckets(ListBucketsRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.listBuckets);
    }

    /**
     * 查看资产列表
     *
     * 查询数据资产扫描授权列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBucketsRequest 请求对象
     * @return SyncInvoker<ListBucketsRequest, ListBucketsResponse>
     */
    public SyncInvoker<ListBucketsRequest, ListBucketsResponse> listBucketsInvoker(ListBucketsRequest request) {
        return new SyncInvoker<>(request, DscMeta.listBuckets, hcClient);
    }

    /**
     * 查询脱敏任务执行列表
     *
     * 查询脱敏任务执行列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbMaskTaskRequest 请求对象
     * @return ListDbMaskTaskResponse
     */
    public ListDbMaskTaskResponse listDbMaskTask(ListDbMaskTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.listDbMaskTask);
    }

    /**
     * 查询脱敏任务执行列表
     *
     * 查询脱敏任务执行列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbMaskTaskRequest 请求对象
     * @return SyncInvoker<ListDbMaskTaskRequest, ListDbMaskTaskResponse>
     */
    public SyncInvoker<ListDbMaskTaskRequest, ListDbMaskTaskResponse> listDbMaskTaskInvoker(
        ListDbMaskTaskRequest request) {
        return new SyncInvoker<>(request, DscMeta.listDbMaskTask, hcClient);
    }

    /**
     * 查询扫描规则组列表
     *
     * 根据指定的项目ID查询扫描规则组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRuleGroupsRequest 请求对象
     * @return ListRuleGroupsResponse
     */
    public ListRuleGroupsResponse listRuleGroups(ListRuleGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.listRuleGroups);
    }

    /**
     * 查询扫描规则组列表
     *
     * 根据指定的项目ID查询扫描规则组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRuleGroupsRequest 请求对象
     * @return SyncInvoker<ListRuleGroupsRequest, ListRuleGroupsResponse>
     */
    public SyncInvoker<ListRuleGroupsRequest, ListRuleGroupsResponse> listRuleGroupsInvoker(
        ListRuleGroupsRequest request) {
        return new SyncInvoker<>(request, DscMeta.listRuleGroups, hcClient);
    }

    /**
     * 提取数据水印
     *
     * 提取请求数据中水印内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatabaseWaterMarkRequest 请求对象
     * @return ShowDatabaseWaterMarkResponse
     */
    public ShowDatabaseWaterMarkResponse showDatabaseWaterMark(ShowDatabaseWaterMarkRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showDatabaseWaterMark);
    }

    /**
     * 提取数据水印
     *
     * 提取请求数据中水印内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatabaseWaterMarkRequest 请求对象
     * @return SyncInvoker<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse>
     */
    public SyncInvoker<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse> showDatabaseWaterMarkInvoker(
        ShowDatabaseWaterMarkRequest request) {
        return new SyncInvoker<>(request, DscMeta.showDatabaseWaterMark, hcClient);
    }

    /**
     * 文档提取暗水印
     *
     * 对已嵌入文字暗水印的WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)类型的文档进行文字暗水印提取，用户以formData的格式传入待提取水印的文件，DSC服务以JSON的格式返回从文档里提取的出的文字暗水印内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDocWatermarkRequest 请求对象
     * @return ShowDocWatermarkResponse
     */
    public ShowDocWatermarkResponse showDocWatermark(ShowDocWatermarkRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showDocWatermark);
    }

    /**
     * 文档提取暗水印
     *
     * 对已嵌入文字暗水印的WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)类型的文档进行文字暗水印提取，用户以formData的格式传入待提取水印的文件，DSC服务以JSON的格式返回从文档里提取的出的文字暗水印内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDocWatermarkRequest 请求对象
     * @return SyncInvoker<ShowDocWatermarkRequest, ShowDocWatermarkResponse>
     */
    public SyncInvoker<ShowDocWatermarkRequest, ShowDocWatermarkResponse> showDocWatermarkInvoker(
        ShowDocWatermarkRequest request) {
        return new SyncInvoker<>(request, DscMeta.showDocWatermark, hcClient);
    }

    /**
     * 文档提取暗水印（文档地址版本）
     *
     * 支持对已嵌入文字暗水印的WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)类型的文档进行水印提取，用户传入待提取水印的文档地址（目前支持OBS），DSC服务以JSON的格式返回从文档里提取的出的文字暗水印内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDocWatermarkByAddressRequest 请求对象
     * @return ShowDocWatermarkByAddressResponse
     */
    public ShowDocWatermarkByAddressResponse showDocWatermarkByAddress(ShowDocWatermarkByAddressRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showDocWatermarkByAddress);
    }

    /**
     * 文档提取暗水印（文档地址版本）
     *
     * 支持对已嵌入文字暗水印的WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)类型的文档进行水印提取，用户传入待提取水印的文档地址（目前支持OBS），DSC服务以JSON的格式返回从文档里提取的出的文字暗水印内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDocWatermarkByAddressRequest 请求对象
     * @return SyncInvoker<ShowDocWatermarkByAddressRequest, ShowDocWatermarkByAddressResponse>
     */
    public SyncInvoker<ShowDocWatermarkByAddressRequest, ShowDocWatermarkByAddressResponse> showDocWatermarkByAddressInvoker(
        ShowDocWatermarkByAddressRequest request) {
        return new SyncInvoker<>(request, DscMeta.showDocWatermarkByAddress, hcClient);
    }

    /**
     * 提取图片中的文字暗水印
     *
     * 对已嵌入文字暗水印的图片进行水印提取，用户以formData的格式传入待提取水印的图片，DSC服务以JSON的格式返回从图片里提取的出的文字暗水印。目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageWatermarkRequest 请求对象
     * @return ShowImageWatermarkResponse
     */
    public ShowImageWatermarkResponse showImageWatermark(ShowImageWatermarkRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showImageWatermark);
    }

    /**
     * 提取图片中的文字暗水印
     *
     * 对已嵌入文字暗水印的图片进行水印提取，用户以formData的格式传入待提取水印的图片，DSC服务以JSON的格式返回从图片里提取的出的文字暗水印。目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageWatermarkRequest 请求对象
     * @return SyncInvoker<ShowImageWatermarkRequest, ShowImageWatermarkResponse>
     */
    public SyncInvoker<ShowImageWatermarkRequest, ShowImageWatermarkResponse> showImageWatermarkInvoker(
        ShowImageWatermarkRequest request) {
        return new SyncInvoker<>(request, DscMeta.showImageWatermark, hcClient);
    }

    /**
     * 提取图片中的文字暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的已嵌入文字暗水印的图片提取文字暗水印，支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageWatermarkByAddressRequest 请求对象
     * @return ShowImageWatermarkByAddressResponse
     */
    public ShowImageWatermarkByAddressResponse showImageWatermarkByAddress(ShowImageWatermarkByAddressRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showImageWatermarkByAddress);
    }

    /**
     * 提取图片中的文字暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的已嵌入文字暗水印的图片提取文字暗水印，支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageWatermarkByAddressRequest 请求对象
     * @return SyncInvoker<ShowImageWatermarkByAddressRequest, ShowImageWatermarkByAddressResponse>
     */
    public SyncInvoker<ShowImageWatermarkByAddressRequest, ShowImageWatermarkByAddressResponse> showImageWatermarkByAddressInvoker(
        ShowImageWatermarkByAddressRequest request) {
        return new SyncInvoker<>(request, DscMeta.showImageWatermarkByAddress, hcClient);
    }

    /**
     * 提取图片中的图片暗水印
     *
     * 对已嵌入图片暗水印的图片进行水印提取，用户以formData的格式传入待提取水印的图片，DSC服务以图片二进制流的格式返回从图片里提取的出的图片暗水印。目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageWatermarkWithImageRequest 请求对象
     * @return ShowImageWatermarkWithImageResponse
     */
    public ShowImageWatermarkWithImageResponse showImageWatermarkWithImage(ShowImageWatermarkWithImageRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showImageWatermarkWithImage);
    }

    /**
     * 提取图片中的图片暗水印
     *
     * 对已嵌入图片暗水印的图片进行水印提取，用户以formData的格式传入待提取水印的图片，DSC服务以图片二进制流的格式返回从图片里提取的出的图片暗水印。目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageWatermarkWithImageRequest 请求对象
     * @return SyncInvoker<ShowImageWatermarkWithImageRequest, ShowImageWatermarkWithImageResponse>
     */
    public SyncInvoker<ShowImageWatermarkWithImageRequest, ShowImageWatermarkWithImageResponse> showImageWatermarkWithImageInvoker(
        ShowImageWatermarkWithImageRequest request) {
        return new SyncInvoker<>(request, DscMeta.showImageWatermarkWithImage, hcClient);
    }

    /**
     * 提取图片中的图片暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的已嵌入图片暗水印的图片提取图片暗水印，提取出的水印图片将存放在用户指定的位置（目前支持华为云OBS），支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageWatermarkWithImageByAddressRequest 请求对象
     * @return ShowImageWatermarkWithImageByAddressResponse
     */
    public ShowImageWatermarkWithImageByAddressResponse showImageWatermarkWithImageByAddress(
        ShowImageWatermarkWithImageByAddressRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showImageWatermarkWithImageByAddress);
    }

    /**
     * 提取图片中的图片暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的已嵌入图片暗水印的图片提取图片暗水印，提取出的水印图片将存放在用户指定的位置（目前支持华为云OBS），支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageWatermarkWithImageByAddressRequest 请求对象
     * @return SyncInvoker<ShowImageWatermarkWithImageByAddressRequest, ShowImageWatermarkWithImageByAddressResponse>
     */
    public SyncInvoker<ShowImageWatermarkWithImageByAddressRequest, ShowImageWatermarkWithImageByAddressResponse> showImageWatermarkWithImageByAddressInvoker(
        ShowImageWatermarkWithImageByAddressRequest request) {
        return new SyncInvoker<>(request, DscMeta.showImageWatermarkWithImageByAddress, hcClient);
    }

    /**
     * 查看规则列表
     *
     * 查询扫描规则列表，返回扫描规则总数和扫描规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRulesRequest 请求对象
     * @return ShowRulesResponse
     */
    public ShowRulesResponse showRules(ShowRulesRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showRules);
    }

    /**
     * 查看规则列表
     *
     * 查询扫描规则列表，返回扫描规则总数和扫描规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRulesRequest 请求对象
     * @return SyncInvoker<ShowRulesRequest, ShowRulesResponse>
     */
    public SyncInvoker<ShowRulesRequest, ShowRulesResponse> showRulesInvoker(ShowRulesRequest request) {
        return new SyncInvoker<>(request, DscMeta.showRules, hcClient);
    }

    /**
     * 查询指定任务扫描结果
     *
     * 查询指定任务扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScanJobResultsRequest 请求对象
     * @return ShowScanJobResultsResponse
     */
    public ShowScanJobResultsResponse showScanJobResults(ShowScanJobResultsRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showScanJobResults);
    }

    /**
     * 查询指定任务扫描结果
     *
     * 查询指定任务扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScanJobResultsRequest 请求对象
     * @return SyncInvoker<ShowScanJobResultsRequest, ShowScanJobResultsResponse>
     */
    public SyncInvoker<ShowScanJobResultsRequest, ShowScanJobResultsResponse> showScanJobResultsInvoker(
        ShowScanJobResultsRequest request) {
        return new SyncInvoker<>(request, DscMeta.showScanJobResults, hcClient);
    }

    /**
     * 查询扫描任务列表
     *
     * 查询扫描任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScanJobsRequest 请求对象
     * @return ShowScanJobsResponse
     */
    public ShowScanJobsResponse showScanJobs(ShowScanJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showScanJobs);
    }

    /**
     * 查询扫描任务列表
     *
     * 查询扫描任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScanJobsRequest 请求对象
     * @return SyncInvoker<ShowScanJobsRequest, ShowScanJobsResponse>
     */
    public SyncInvoker<ShowScanJobsRequest, ShowScanJobsResponse> showScanJobsInvoker(ShowScanJobsRequest request) {
        return new SyncInvoker<>(request, DscMeta.showScanJobs, hcClient);
    }

    /**
     * 查询资源开通信息
     *
     * 查询资源开通信息，根据项目ID查询订单详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSpecificationRequest 请求对象
     * @return ShowSpecificationResponse
     */
    public ShowSpecificationResponse showSpecification(ShowSpecificationRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showSpecification);
    }

    /**
     * 查询资源开通信息
     *
     * 查询资源开通信息，根据项目ID查询订单详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSpecificationRequest 请求对象
     * @return SyncInvoker<ShowSpecificationRequest, ShowSpecificationResponse>
     */
    public SyncInvoker<ShowSpecificationRequest, ShowSpecificationResponse> showSpecificationInvoker(
        ShowSpecificationRequest request) {
        return new SyncInvoker<>(request, DscMeta.showSpecification, hcClient);
    }

    /**
     * 查询告警通知主题
     *
     * 查询告警通知主题，返回默认主题、已确认主题数量及列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTopicsRequest 请求对象
     * @return ShowTopicsResponse
     */
    public ShowTopicsResponse showTopics(ShowTopicsRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showTopics);
    }

    /**
     * 查询告警通知主题
     *
     * 查询告警通知主题，返回默认主题、已确认主题数量及列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTopicsRequest 请求对象
     * @return SyncInvoker<ShowTopicsRequest, ShowTopicsResponse>
     */
    public SyncInvoker<ShowTopicsRequest, ShowTopicsResponse> showTopicsInvoker(ShowTopicsRequest request) {
        return new SyncInvoker<>(request, DscMeta.showTopics, hcClient);
    }

    /**
     * 编辑资产名称
     *
     * 编辑数据资产名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssetNameRequest 请求对象
     * @return UpdateAssetNameResponse
     */
    public UpdateAssetNameResponse updateAssetName(UpdateAssetNameRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.updateAssetName);
    }

    /**
     * 编辑资产名称
     *
     * 编辑数据资产名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssetNameRequest 请求对象
     * @return SyncInvoker<UpdateAssetNameRequest, UpdateAssetNameResponse>
     */
    public SyncInvoker<UpdateAssetNameRequest, UpdateAssetNameResponse> updateAssetNameInvoker(
        UpdateAssetNameRequest request) {
        return new SyncInvoker<>(request, DscMeta.updateAssetName, hcClient);
    }

    /**
     * 修改告警通知主题
     *
     * 修改告警通知的关联项目ID、通知主题、通知状态(0为关闭通知，1为开启通知)等通用配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDefaultTopicRequest 请求对象
     * @return UpdateDefaultTopicResponse
     */
    public UpdateDefaultTopicResponse updateDefaultTopic(UpdateDefaultTopicRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.updateDefaultTopic);
    }

    /**
     * 修改告警通知主题
     *
     * 修改告警通知的关联项目ID、通知主题、通知状态(0为关闭通知，1为开启通知)等通用配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDefaultTopicRequest 请求对象
     * @return SyncInvoker<UpdateDefaultTopicRequest, UpdateDefaultTopicResponse>
     */
    public SyncInvoker<UpdateDefaultTopicRequest, UpdateDefaultTopicResponse> updateDefaultTopicInvoker(
        UpdateDefaultTopicRequest request) {
        return new SyncInvoker<>(request, DscMeta.updateDefaultTopic, hcClient);
    }

    /**
     * 查询OpenApi调用记录
     *
     * 查询OpenApi调用记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOpenApiCalledRecordsRequest 请求对象
     * @return ShowOpenApiCalledRecordsResponse
     */
    public ShowOpenApiCalledRecordsResponse showOpenApiCalledRecords(ShowOpenApiCalledRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showOpenApiCalledRecords);
    }

    /**
     * 查询OpenApi调用记录
     *
     * 查询OpenApi调用记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOpenApiCalledRecordsRequest 请求对象
     * @return SyncInvoker<ShowOpenApiCalledRecordsRequest, ShowOpenApiCalledRecordsResponse>
     */
    public SyncInvoker<ShowOpenApiCalledRecordsRequest, ShowOpenApiCalledRecordsResponse> showOpenApiCalledRecordsInvoker(
        ShowOpenApiCalledRecordsRequest request) {
        return new SyncInvoker<>(request, DscMeta.showOpenApiCalledRecords, hcClient);
    }

}
