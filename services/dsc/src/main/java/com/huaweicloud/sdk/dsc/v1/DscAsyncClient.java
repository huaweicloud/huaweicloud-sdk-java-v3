package com.huaweicloud.sdk.dsc.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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

import java.util.concurrent.CompletableFuture;

public class DscAsyncClient {

    protected HcClient hcClient;

    public DscAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DscAsyncClient> newBuilder() {
        ClientBuilder<DscAsyncClient> clientBuilder = new ClientBuilder<>(DscAsyncClient::new);
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
     * @return CompletableFuture<AddBucketsResponse>
     */
    public CompletableFuture<AddBucketsResponse> addBucketsAsync(AddBucketsRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.addBuckets);
    }

    /**
     * 添加资产授权
     *
     * 添加数据资产扫描授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddBucketsRequest 请求对象
     * @return AsyncInvoker<AddBucketsRequest, AddBucketsResponse>
     */
    public AsyncInvoker<AddBucketsRequest, AddBucketsResponse> addBucketsAsyncInvoker(AddBucketsRequest request) {
        return new AsyncInvoker<>(request, DscMeta.addBuckets, hcClient);
    }

    /**
     * 创建扫描规则
     *
     * 根据指定的规则名称、规则类型、风险等级、最小匹配次数等参数创建自定义的敏感数据识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRuleRequest 请求对象
     * @return CompletableFuture<AddRuleResponse>
     */
    public CompletableFuture<AddRuleResponse> addRuleAsync(AddRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.addRule);
    }

    /**
     * 创建扫描规则
     *
     * 根据指定的规则名称、规则类型、风险等级、最小匹配次数等参数创建自定义的敏感数据识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRuleRequest 请求对象
     * @return AsyncInvoker<AddRuleRequest, AddRuleResponse>
     */
    public AsyncInvoker<AddRuleRequest, AddRuleResponse> addRuleAsyncInvoker(AddRuleRequest request) {
        return new AsyncInvoker<>(request, DscMeta.addRule, hcClient);
    }

    /**
     * 创建扫描规则组
     *
     * 根据指定的规则组名称和扫描规则列表创建敏感数据扫描规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRuleGroupRequest 请求对象
     * @return CompletableFuture<AddRuleGroupResponse>
     */
    public CompletableFuture<AddRuleGroupResponse> addRuleGroupAsync(AddRuleGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.addRuleGroup);
    }

    /**
     * 创建扫描规则组
     *
     * 根据指定的规则组名称和扫描规则列表创建敏感数据扫描规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRuleGroupRequest 请求对象
     * @return AsyncInvoker<AddRuleGroupRequest, AddRuleGroupResponse>
     */
    public AsyncInvoker<AddRuleGroupRequest, AddRuleGroupResponse> addRuleGroupAsyncInvoker(
        AddRuleGroupRequest request) {
        return new AsyncInvoker<>(request, DscMeta.addRuleGroup, hcClient);
    }

    /**
     * 创建扫描任务
     *
     * 根据指定的任务名称、扫描方式、扫描周期、扫描规则组、扫描时间创建扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddScanJobRequest 请求对象
     * @return CompletableFuture<AddScanJobResponse>
     */
    public CompletableFuture<AddScanJobResponse> addScanJobAsync(AddScanJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.addScanJob);
    }

    /**
     * 创建扫描任务
     *
     * 根据指定的任务名称、扫描方式、扫描周期、扫描规则组、扫描时间创建扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddScanJobRequest 请求对象
     * @return AsyncInvoker<AddScanJobRequest, AddScanJobResponse>
     */
    public AsyncInvoker<AddScanJobRequest, AddScanJobResponse> addScanJobAsyncInvoker(AddScanJobRequest request) {
        return new AsyncInvoker<>(request, DscMeta.addScanJob, hcClient);
    }

    /**
     * 对数据进行脱敏
     *
     * 对数据进行脱敏
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddDataMaskRequest 请求对象
     * @return CompletableFuture<BatchAddDataMaskResponse>
     */
    public CompletableFuture<BatchAddDataMaskResponse> batchAddDataMaskAsync(BatchAddDataMaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.batchAddDataMask);
    }

    /**
     * 对数据进行脱敏
     *
     * 对数据进行脱敏
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddDataMaskRequest 请求对象
     * @return AsyncInvoker<BatchAddDataMaskRequest, BatchAddDataMaskResponse>
     */
    public AsyncInvoker<BatchAddDataMaskRequest, BatchAddDataMaskResponse> batchAddDataMaskAsyncInvoker(
        BatchAddDataMaskRequest request) {
        return new AsyncInvoker<>(request, DscMeta.batchAddDataMask, hcClient);
    }

    /**
     * 开启/停止脱敏任务
     *
     * 开启/停止脱敏任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDbTemplateOperationRequest 请求对象
     * @return CompletableFuture<ChangeDbTemplateOperationResponse>
     */
    public CompletableFuture<ChangeDbTemplateOperationResponse> changeDbTemplateOperationAsync(
        ChangeDbTemplateOperationRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.changeDbTemplateOperation);
    }

    /**
     * 开启/停止脱敏任务
     *
     * 开启/停止脱敏任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDbTemplateOperationRequest 请求对象
     * @return AsyncInvoker<ChangeDbTemplateOperationRequest, ChangeDbTemplateOperationResponse>
     */
    public AsyncInvoker<ChangeDbTemplateOperationRequest, ChangeDbTemplateOperationResponse> changeDbTemplateOperationAsyncInvoker(
        ChangeDbTemplateOperationRequest request) {
        return new AsyncInvoker<>(request, DscMeta.changeDbTemplateOperation, hcClient);
    }

    /**
     * 修改扫描规则
     *
     * 修改自定义的敏感数据识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeRuleRequest 请求对象
     * @return CompletableFuture<ChangeRuleResponse>
     */
    public CompletableFuture<ChangeRuleResponse> changeRuleAsync(ChangeRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.changeRule);
    }

    /**
     * 修改扫描规则
     *
     * 修改自定义的敏感数据识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeRuleRequest 请求对象
     * @return AsyncInvoker<ChangeRuleRequest, ChangeRuleResponse>
     */
    public AsyncInvoker<ChangeRuleRequest, ChangeRuleResponse> changeRuleAsyncInvoker(ChangeRuleRequest request) {
        return new AsyncInvoker<>(request, DscMeta.changeRule, hcClient);
    }

    /**
     * 嵌入数据水印
     *
     * 对json体中数据动态添加水印
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseWaterMarkRequest 请求对象
     * @return CompletableFuture<CreateDatabaseWaterMarkResponse>
     */
    public CompletableFuture<CreateDatabaseWaterMarkResponse> createDatabaseWaterMarkAsync(
        CreateDatabaseWaterMarkRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.createDatabaseWaterMark);
    }

    /**
     * 嵌入数据水印
     *
     * 对json体中数据动态添加水印
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseWaterMarkRequest 请求对象
     * @return AsyncInvoker<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse>
     */
    public AsyncInvoker<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse> createDatabaseWaterMarkAsyncInvoker(
        CreateDatabaseWaterMarkRequest request) {
        return new AsyncInvoker<>(request, DscMeta.createDatabaseWaterMark, hcClient);
    }

    /**
     * 文档嵌入水印
     *
     * 对WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf) 类型的文件嵌入文字暗水印、文字明水印或者图片明水印，用户以formData的格式传入待加水印的文件和水印相关信息，DSC服务给文件加完水印后返回给用户已嵌入水印的文件的二进制流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDocWatermarkRequest 请求对象
     * @return CompletableFuture<CreateDocWatermarkResponse>
     */
    public CompletableFuture<CreateDocWatermarkResponse> createDocWatermarkAsync(CreateDocWatermarkRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.createDocWatermark);
    }

    /**
     * 文档嵌入水印
     *
     * 对WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf) 类型的文件嵌入文字暗水印、文字明水印或者图片明水印，用户以formData的格式传入待加水印的文件和水印相关信息，DSC服务给文件加完水印后返回给用户已嵌入水印的文件的二进制流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDocWatermarkRequest 请求对象
     * @return AsyncInvoker<CreateDocWatermarkRequest, CreateDocWatermarkResponse>
     */
    public AsyncInvoker<CreateDocWatermarkRequest, CreateDocWatermarkResponse> createDocWatermarkAsyncInvoker(
        CreateDocWatermarkRequest request) {
        return new AsyncInvoker<>(request, DscMeta.createDocWatermark, hcClient);
    }

    /**
     * 文档嵌入水印（文件地址版本）
     *
     * 对WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)*类型的文档嵌入文字暗水印、文字明水印或者图片明水印，用户传入待加水印的文档地址（目前支持OBS)和水印相关信息，DSC服务对文档加完水印后返回给用户已嵌入水印的文档的存放地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDocWatermarkByAddressRequest 请求对象
     * @return CompletableFuture<CreateDocWatermarkByAddressResponse>
     */
    public CompletableFuture<CreateDocWatermarkByAddressResponse> createDocWatermarkByAddressAsync(
        CreateDocWatermarkByAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.createDocWatermarkByAddress);
    }

    /**
     * 文档嵌入水印（文件地址版本）
     *
     * 对WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)*类型的文档嵌入文字暗水印、文字明水印或者图片明水印，用户传入待加水印的文档地址（目前支持OBS)和水印相关信息，DSC服务对文档加完水印后返回给用户已嵌入水印的文档的存放地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDocWatermarkByAddressRequest 请求对象
     * @return AsyncInvoker<CreateDocWatermarkByAddressRequest, CreateDocWatermarkByAddressResponse>
     */
    public AsyncInvoker<CreateDocWatermarkByAddressRequest, CreateDocWatermarkByAddressResponse> createDocWatermarkByAddressAsyncInvoker(
        CreateDocWatermarkByAddressRequest request) {
        return new AsyncInvoker<>(request, DscMeta.createDocWatermarkByAddress, hcClient);
    }

    /**
     * 图片嵌入暗水印
     *
     * 对图片嵌入文字暗水印或者图片暗水印，用户以formData的格式传入待加水印图片和水印相关信息，DSC服务对图片加完水印后返回给用户已嵌入水印的图片二进制流，目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageWatermarkRequest 请求对象
     * @return CompletableFuture<CreateImageWatermarkResponse>
     */
    public CompletableFuture<CreateImageWatermarkResponse> createImageWatermarkAsync(
        CreateImageWatermarkRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.createImageWatermark);
    }

    /**
     * 图片嵌入暗水印
     *
     * 对图片嵌入文字暗水印或者图片暗水印，用户以formData的格式传入待加水印图片和水印相关信息，DSC服务对图片加完水印后返回给用户已嵌入水印的图片二进制流，目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageWatermarkRequest 请求对象
     * @return AsyncInvoker<CreateImageWatermarkRequest, CreateImageWatermarkResponse>
     */
    public AsyncInvoker<CreateImageWatermarkRequest, CreateImageWatermarkResponse> createImageWatermarkAsyncInvoker(
        CreateImageWatermarkRequest request) {
        return new AsyncInvoker<>(request, DscMeta.createImageWatermark, hcClient);
    }

    /**
     * 图片嵌入暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的图片嵌入文字暗水印或者图片暗水印，已嵌入的水印的图片将存放在用户指定的位置（目前支持华为云OBS），支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageWatermarkByAddressRequest 请求对象
     * @return CompletableFuture<CreateImageWatermarkByAddressResponse>
     */
    public CompletableFuture<CreateImageWatermarkByAddressResponse> createImageWatermarkByAddressAsync(
        CreateImageWatermarkByAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.createImageWatermarkByAddress);
    }

    /**
     * 图片嵌入暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的图片嵌入文字暗水印或者图片暗水印，已嵌入的水印的图片将存放在用户指定的位置（目前支持华为云OBS），支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageWatermarkByAddressRequest 请求对象
     * @return AsyncInvoker<CreateImageWatermarkByAddressRequest, CreateImageWatermarkByAddressResponse>
     */
    public AsyncInvoker<CreateImageWatermarkByAddressRequest, CreateImageWatermarkByAddressResponse> createImageWatermarkByAddressAsyncInvoker(
        CreateImageWatermarkByAddressRequest request) {
        return new AsyncInvoker<>(request, DscMeta.createImageWatermarkByAddress, hcClient);
    }

    /**
     * 实例下单
     *
     * 根据计费方式、计费周期等信息进行实例下单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProductOrderRequest 请求对象
     * @return CompletableFuture<CreateProductOrderResponse>
     */
    public CompletableFuture<CreateProductOrderResponse> createProductOrderAsync(CreateProductOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.createProductOrder);
    }

    /**
     * 实例下单
     *
     * 根据计费方式、计费周期等信息进行实例下单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProductOrderRequest 请求对象
     * @return AsyncInvoker<CreateProductOrderRequest, CreateProductOrderResponse>
     */
    public AsyncInvoker<CreateProductOrderRequest, CreateProductOrderResponse> createProductOrderAsyncInvoker(
        CreateProductOrderRequest request) {
        return new AsyncInvoker<>(request, DscMeta.createProductOrder, hcClient);
    }

    /**
     * 删除资产授权
     *
     * 删除数据资产扫描授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBucketRequest 请求对象
     * @return CompletableFuture<DeleteBucketResponse>
     */
    public CompletableFuture<DeleteBucketResponse> deleteBucketAsync(DeleteBucketRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.deleteBucket);
    }

    /**
     * 删除资产授权
     *
     * 删除数据资产扫描授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBucketRequest 请求对象
     * @return AsyncInvoker<DeleteBucketRequest, DeleteBucketResponse>
     */
    public AsyncInvoker<DeleteBucketRequest, DeleteBucketResponse> deleteBucketAsyncInvoker(
        DeleteBucketRequest request) {
        return new AsyncInvoker<>(request, DscMeta.deleteBucket, hcClient);
    }

    /**
     * 删除扫描规则
     *
     * 删除指定的敏感数据识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRuleRequest 请求对象
     * @return CompletableFuture<DeleteRuleResponse>
     */
    public CompletableFuture<DeleteRuleResponse> deleteRuleAsync(DeleteRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.deleteRule);
    }

    /**
     * 删除扫描规则
     *
     * 删除指定的敏感数据识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRuleRequest 请求对象
     * @return AsyncInvoker<DeleteRuleRequest, DeleteRuleResponse>
     */
    public AsyncInvoker<DeleteRuleRequest, DeleteRuleResponse> deleteRuleAsyncInvoker(DeleteRuleRequest request) {
        return new AsyncInvoker<>(request, DscMeta.deleteRule, hcClient);
    }

    /**
     * 删除扫描规则组
     *
     * 根据扫描规则组ID删除指定的扫描规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRuleGroupRequest 请求对象
     * @return CompletableFuture<DeleteRuleGroupResponse>
     */
    public CompletableFuture<DeleteRuleGroupResponse> deleteRuleGroupAsync(DeleteRuleGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.deleteRuleGroup);
    }

    /**
     * 删除扫描规则组
     *
     * 根据扫描规则组ID删除指定的扫描规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRuleGroupRequest 请求对象
     * @return AsyncInvoker<DeleteRuleGroupRequest, DeleteRuleGroupResponse>
     */
    public AsyncInvoker<DeleteRuleGroupRequest, DeleteRuleGroupResponse> deleteRuleGroupAsyncInvoker(
        DeleteRuleGroupRequest request) {
        return new AsyncInvoker<>(request, DscMeta.deleteRuleGroup, hcClient);
    }

    /**
     * 删除扫描任务
     *
     * 删除扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScanJobRequest 请求对象
     * @return CompletableFuture<DeleteScanJobResponse>
     */
    public CompletableFuture<DeleteScanJobResponse> deleteScanJobAsync(DeleteScanJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.deleteScanJob);
    }

    /**
     * 删除扫描任务
     *
     * 删除扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScanJobRequest 请求对象
     * @return AsyncInvoker<DeleteScanJobRequest, DeleteScanJobResponse>
     */
    public AsyncInvoker<DeleteScanJobRequest, DeleteScanJobResponse> deleteScanJobAsyncInvoker(
        DeleteScanJobRequest request) {
        return new AsyncInvoker<>(request, DscMeta.deleteScanJob, hcClient);
    }

    /**
     * 查看资产列表
     *
     * 查询数据资产扫描授权列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBucketsRequest 请求对象
     * @return CompletableFuture<ListBucketsResponse>
     */
    public CompletableFuture<ListBucketsResponse> listBucketsAsync(ListBucketsRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.listBuckets);
    }

    /**
     * 查看资产列表
     *
     * 查询数据资产扫描授权列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBucketsRequest 请求对象
     * @return AsyncInvoker<ListBucketsRequest, ListBucketsResponse>
     */
    public AsyncInvoker<ListBucketsRequest, ListBucketsResponse> listBucketsAsyncInvoker(ListBucketsRequest request) {
        return new AsyncInvoker<>(request, DscMeta.listBuckets, hcClient);
    }

    /**
     * 查询脱敏任务执行列表
     *
     * 查询脱敏任务执行列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbMaskTaskRequest 请求对象
     * @return CompletableFuture<ListDbMaskTaskResponse>
     */
    public CompletableFuture<ListDbMaskTaskResponse> listDbMaskTaskAsync(ListDbMaskTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.listDbMaskTask);
    }

    /**
     * 查询脱敏任务执行列表
     *
     * 查询脱敏任务执行列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbMaskTaskRequest 请求对象
     * @return AsyncInvoker<ListDbMaskTaskRequest, ListDbMaskTaskResponse>
     */
    public AsyncInvoker<ListDbMaskTaskRequest, ListDbMaskTaskResponse> listDbMaskTaskAsyncInvoker(
        ListDbMaskTaskRequest request) {
        return new AsyncInvoker<>(request, DscMeta.listDbMaskTask, hcClient);
    }

    /**
     * 查询扫描规则组列表
     *
     * 根据指定的项目ID查询扫描规则组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRuleGroupsRequest 请求对象
     * @return CompletableFuture<ListRuleGroupsResponse>
     */
    public CompletableFuture<ListRuleGroupsResponse> listRuleGroupsAsync(ListRuleGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.listRuleGroups);
    }

    /**
     * 查询扫描规则组列表
     *
     * 根据指定的项目ID查询扫描规则组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRuleGroupsRequest 请求对象
     * @return AsyncInvoker<ListRuleGroupsRequest, ListRuleGroupsResponse>
     */
    public AsyncInvoker<ListRuleGroupsRequest, ListRuleGroupsResponse> listRuleGroupsAsyncInvoker(
        ListRuleGroupsRequest request) {
        return new AsyncInvoker<>(request, DscMeta.listRuleGroups, hcClient);
    }

    /**
     * 提取数据水印
     *
     * 提取请求数据中水印内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatabaseWaterMarkRequest 请求对象
     * @return CompletableFuture<ShowDatabaseWaterMarkResponse>
     */
    public CompletableFuture<ShowDatabaseWaterMarkResponse> showDatabaseWaterMarkAsync(
        ShowDatabaseWaterMarkRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showDatabaseWaterMark);
    }

    /**
     * 提取数据水印
     *
     * 提取请求数据中水印内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatabaseWaterMarkRequest 请求对象
     * @return AsyncInvoker<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse>
     */
    public AsyncInvoker<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse> showDatabaseWaterMarkAsyncInvoker(
        ShowDatabaseWaterMarkRequest request) {
        return new AsyncInvoker<>(request, DscMeta.showDatabaseWaterMark, hcClient);
    }

    /**
     * 文档提取暗水印
     *
     * 对已嵌入文字暗水印的WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)类型的文档进行文字暗水印提取，用户以formData的格式传入待提取水印的文件，DSC服务以JSON的格式返回从文档里提取的出的文字暗水印内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDocWatermarkRequest 请求对象
     * @return CompletableFuture<ShowDocWatermarkResponse>
     */
    public CompletableFuture<ShowDocWatermarkResponse> showDocWatermarkAsync(ShowDocWatermarkRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showDocWatermark);
    }

    /**
     * 文档提取暗水印
     *
     * 对已嵌入文字暗水印的WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)类型的文档进行文字暗水印提取，用户以formData的格式传入待提取水印的文件，DSC服务以JSON的格式返回从文档里提取的出的文字暗水印内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDocWatermarkRequest 请求对象
     * @return AsyncInvoker<ShowDocWatermarkRequest, ShowDocWatermarkResponse>
     */
    public AsyncInvoker<ShowDocWatermarkRequest, ShowDocWatermarkResponse> showDocWatermarkAsyncInvoker(
        ShowDocWatermarkRequest request) {
        return new AsyncInvoker<>(request, DscMeta.showDocWatermark, hcClient);
    }

    /**
     * 文档提取暗水印（文档地址版本）
     *
     * 支持对已嵌入文字暗水印的WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)类型的文档进行水印提取，用户传入待提取水印的文档地址（目前支持OBS），DSC服务以JSON的格式返回从文档里提取的出的文字暗水印内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDocWatermarkByAddressRequest 请求对象
     * @return CompletableFuture<ShowDocWatermarkByAddressResponse>
     */
    public CompletableFuture<ShowDocWatermarkByAddressResponse> showDocWatermarkByAddressAsync(
        ShowDocWatermarkByAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showDocWatermarkByAddress);
    }

    /**
     * 文档提取暗水印（文档地址版本）
     *
     * 支持对已嵌入文字暗水印的WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)类型的文档进行水印提取，用户传入待提取水印的文档地址（目前支持OBS），DSC服务以JSON的格式返回从文档里提取的出的文字暗水印内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDocWatermarkByAddressRequest 请求对象
     * @return AsyncInvoker<ShowDocWatermarkByAddressRequest, ShowDocWatermarkByAddressResponse>
     */
    public AsyncInvoker<ShowDocWatermarkByAddressRequest, ShowDocWatermarkByAddressResponse> showDocWatermarkByAddressAsyncInvoker(
        ShowDocWatermarkByAddressRequest request) {
        return new AsyncInvoker<>(request, DscMeta.showDocWatermarkByAddress, hcClient);
    }

    /**
     * 提取图片中的文字暗水印
     *
     * 对已嵌入文字暗水印的图片进行水印提取，用户以formData的格式传入待提取水印的图片，DSC服务以JSON的格式返回从图片里提取的出的文字暗水印。目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageWatermarkRequest 请求对象
     * @return CompletableFuture<ShowImageWatermarkResponse>
     */
    public CompletableFuture<ShowImageWatermarkResponse> showImageWatermarkAsync(ShowImageWatermarkRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showImageWatermark);
    }

    /**
     * 提取图片中的文字暗水印
     *
     * 对已嵌入文字暗水印的图片进行水印提取，用户以formData的格式传入待提取水印的图片，DSC服务以JSON的格式返回从图片里提取的出的文字暗水印。目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageWatermarkRequest 请求对象
     * @return AsyncInvoker<ShowImageWatermarkRequest, ShowImageWatermarkResponse>
     */
    public AsyncInvoker<ShowImageWatermarkRequest, ShowImageWatermarkResponse> showImageWatermarkAsyncInvoker(
        ShowImageWatermarkRequest request) {
        return new AsyncInvoker<>(request, DscMeta.showImageWatermark, hcClient);
    }

    /**
     * 提取图片中的文字暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的已嵌入文字暗水印的图片提取文字暗水印，支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageWatermarkByAddressRequest 请求对象
     * @return CompletableFuture<ShowImageWatermarkByAddressResponse>
     */
    public CompletableFuture<ShowImageWatermarkByAddressResponse> showImageWatermarkByAddressAsync(
        ShowImageWatermarkByAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showImageWatermarkByAddress);
    }

    /**
     * 提取图片中的文字暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的已嵌入文字暗水印的图片提取文字暗水印，支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageWatermarkByAddressRequest 请求对象
     * @return AsyncInvoker<ShowImageWatermarkByAddressRequest, ShowImageWatermarkByAddressResponse>
     */
    public AsyncInvoker<ShowImageWatermarkByAddressRequest, ShowImageWatermarkByAddressResponse> showImageWatermarkByAddressAsyncInvoker(
        ShowImageWatermarkByAddressRequest request) {
        return new AsyncInvoker<>(request, DscMeta.showImageWatermarkByAddress, hcClient);
    }

    /**
     * 提取图片中的图片暗水印
     *
     * 对已嵌入图片暗水印的图片进行水印提取，用户以formData的格式传入待提取水印的图片，DSC服务以图片二进制流的格式返回从图片里提取的出的图片暗水印。目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageWatermarkWithImageRequest 请求对象
     * @return CompletableFuture<ShowImageWatermarkWithImageResponse>
     */
    public CompletableFuture<ShowImageWatermarkWithImageResponse> showImageWatermarkWithImageAsync(
        ShowImageWatermarkWithImageRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showImageWatermarkWithImage);
    }

    /**
     * 提取图片中的图片暗水印
     *
     * 对已嵌入图片暗水印的图片进行水印提取，用户以formData的格式传入待提取水印的图片，DSC服务以图片二进制流的格式返回从图片里提取的出的图片暗水印。目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageWatermarkWithImageRequest 请求对象
     * @return AsyncInvoker<ShowImageWatermarkWithImageRequest, ShowImageWatermarkWithImageResponse>
     */
    public AsyncInvoker<ShowImageWatermarkWithImageRequest, ShowImageWatermarkWithImageResponse> showImageWatermarkWithImageAsyncInvoker(
        ShowImageWatermarkWithImageRequest request) {
        return new AsyncInvoker<>(request, DscMeta.showImageWatermarkWithImage, hcClient);
    }

    /**
     * 提取图片中的图片暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的已嵌入图片暗水印的图片提取图片暗水印，提取出的水印图片将存放在用户指定的位置（目前支持华为云OBS），支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageWatermarkWithImageByAddressRequest 请求对象
     * @return CompletableFuture<ShowImageWatermarkWithImageByAddressResponse>
     */
    public CompletableFuture<ShowImageWatermarkWithImageByAddressResponse> showImageWatermarkWithImageByAddressAsync(
        ShowImageWatermarkWithImageByAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showImageWatermarkWithImageByAddress);
    }

    /**
     * 提取图片中的图片暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的已嵌入图片暗水印的图片提取图片暗水印，提取出的水印图片将存放在用户指定的位置（目前支持华为云OBS），支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageWatermarkWithImageByAddressRequest 请求对象
     * @return AsyncInvoker<ShowImageWatermarkWithImageByAddressRequest, ShowImageWatermarkWithImageByAddressResponse>
     */
    public AsyncInvoker<ShowImageWatermarkWithImageByAddressRequest, ShowImageWatermarkWithImageByAddressResponse> showImageWatermarkWithImageByAddressAsyncInvoker(
        ShowImageWatermarkWithImageByAddressRequest request) {
        return new AsyncInvoker<>(request, DscMeta.showImageWatermarkWithImageByAddress, hcClient);
    }

    /**
     * 查看规则列表
     *
     * 查询扫描规则列表，返回扫描规则总数和扫描规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRulesRequest 请求对象
     * @return CompletableFuture<ShowRulesResponse>
     */
    public CompletableFuture<ShowRulesResponse> showRulesAsync(ShowRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showRules);
    }

    /**
     * 查看规则列表
     *
     * 查询扫描规则列表，返回扫描规则总数和扫描规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRulesRequest 请求对象
     * @return AsyncInvoker<ShowRulesRequest, ShowRulesResponse>
     */
    public AsyncInvoker<ShowRulesRequest, ShowRulesResponse> showRulesAsyncInvoker(ShowRulesRequest request) {
        return new AsyncInvoker<>(request, DscMeta.showRules, hcClient);
    }

    /**
     * 查询指定任务扫描结果
     *
     * 查询指定任务扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScanJobResultsRequest 请求对象
     * @return CompletableFuture<ShowScanJobResultsResponse>
     */
    public CompletableFuture<ShowScanJobResultsResponse> showScanJobResultsAsync(ShowScanJobResultsRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showScanJobResults);
    }

    /**
     * 查询指定任务扫描结果
     *
     * 查询指定任务扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScanJobResultsRequest 请求对象
     * @return AsyncInvoker<ShowScanJobResultsRequest, ShowScanJobResultsResponse>
     */
    public AsyncInvoker<ShowScanJobResultsRequest, ShowScanJobResultsResponse> showScanJobResultsAsyncInvoker(
        ShowScanJobResultsRequest request) {
        return new AsyncInvoker<>(request, DscMeta.showScanJobResults, hcClient);
    }

    /**
     * 查询扫描任务列表
     *
     * 查询扫描任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScanJobsRequest 请求对象
     * @return CompletableFuture<ShowScanJobsResponse>
     */
    public CompletableFuture<ShowScanJobsResponse> showScanJobsAsync(ShowScanJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showScanJobs);
    }

    /**
     * 查询扫描任务列表
     *
     * 查询扫描任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScanJobsRequest 请求对象
     * @return AsyncInvoker<ShowScanJobsRequest, ShowScanJobsResponse>
     */
    public AsyncInvoker<ShowScanJobsRequest, ShowScanJobsResponse> showScanJobsAsyncInvoker(
        ShowScanJobsRequest request) {
        return new AsyncInvoker<>(request, DscMeta.showScanJobs, hcClient);
    }

    /**
     * 查询资源开通信息
     *
     * 查询资源开通信息，根据项目ID查询订单详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSpecificationRequest 请求对象
     * @return CompletableFuture<ShowSpecificationResponse>
     */
    public CompletableFuture<ShowSpecificationResponse> showSpecificationAsync(ShowSpecificationRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showSpecification);
    }

    /**
     * 查询资源开通信息
     *
     * 查询资源开通信息，根据项目ID查询订单详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSpecificationRequest 请求对象
     * @return AsyncInvoker<ShowSpecificationRequest, ShowSpecificationResponse>
     */
    public AsyncInvoker<ShowSpecificationRequest, ShowSpecificationResponse> showSpecificationAsyncInvoker(
        ShowSpecificationRequest request) {
        return new AsyncInvoker<>(request, DscMeta.showSpecification, hcClient);
    }

    /**
     * 查询告警通知主题
     *
     * 查询告警通知主题，返回默认主题、已确认主题数量及列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTopicsRequest 请求对象
     * @return CompletableFuture<ShowTopicsResponse>
     */
    public CompletableFuture<ShowTopicsResponse> showTopicsAsync(ShowTopicsRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showTopics);
    }

    /**
     * 查询告警通知主题
     *
     * 查询告警通知主题，返回默认主题、已确认主题数量及列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTopicsRequest 请求对象
     * @return AsyncInvoker<ShowTopicsRequest, ShowTopicsResponse>
     */
    public AsyncInvoker<ShowTopicsRequest, ShowTopicsResponse> showTopicsAsyncInvoker(ShowTopicsRequest request) {
        return new AsyncInvoker<>(request, DscMeta.showTopics, hcClient);
    }

    /**
     * 编辑资产名称
     *
     * 编辑数据资产名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssetNameRequest 请求对象
     * @return CompletableFuture<UpdateAssetNameResponse>
     */
    public CompletableFuture<UpdateAssetNameResponse> updateAssetNameAsync(UpdateAssetNameRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.updateAssetName);
    }

    /**
     * 编辑资产名称
     *
     * 编辑数据资产名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssetNameRequest 请求对象
     * @return AsyncInvoker<UpdateAssetNameRequest, UpdateAssetNameResponse>
     */
    public AsyncInvoker<UpdateAssetNameRequest, UpdateAssetNameResponse> updateAssetNameAsyncInvoker(
        UpdateAssetNameRequest request) {
        return new AsyncInvoker<>(request, DscMeta.updateAssetName, hcClient);
    }

    /**
     * 修改告警通知主题
     *
     * 修改告警通知的关联项目ID、通知主题、通知状态(0为关闭通知，1为开启通知)等通用配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDefaultTopicRequest 请求对象
     * @return CompletableFuture<UpdateDefaultTopicResponse>
     */
    public CompletableFuture<UpdateDefaultTopicResponse> updateDefaultTopicAsync(UpdateDefaultTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.updateDefaultTopic);
    }

    /**
     * 修改告警通知主题
     *
     * 修改告警通知的关联项目ID、通知主题、通知状态(0为关闭通知，1为开启通知)等通用配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDefaultTopicRequest 请求对象
     * @return AsyncInvoker<UpdateDefaultTopicRequest, UpdateDefaultTopicResponse>
     */
    public AsyncInvoker<UpdateDefaultTopicRequest, UpdateDefaultTopicResponse> updateDefaultTopicAsyncInvoker(
        UpdateDefaultTopicRequest request) {
        return new AsyncInvoker<>(request, DscMeta.updateDefaultTopic, hcClient);
    }

    /**
     * 查询OpenApi调用记录
     *
     * 查询OpenApi调用记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOpenApiCalledRecordsRequest 请求对象
     * @return CompletableFuture<ShowOpenApiCalledRecordsResponse>
     */
    public CompletableFuture<ShowOpenApiCalledRecordsResponse> showOpenApiCalledRecordsAsync(
        ShowOpenApiCalledRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showOpenApiCalledRecords);
    }

    /**
     * 查询OpenApi调用记录
     *
     * 查询OpenApi调用记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOpenApiCalledRecordsRequest 请求对象
     * @return AsyncInvoker<ShowOpenApiCalledRecordsRequest, ShowOpenApiCalledRecordsResponse>
     */
    public AsyncInvoker<ShowOpenApiCalledRecordsRequest, ShowOpenApiCalledRecordsResponse> showOpenApiCalledRecordsAsyncInvoker(
        ShowOpenApiCalledRecordsRequest request) {
        return new AsyncInvoker<>(request, DscMeta.showOpenApiCalledRecords, hcClient);
    }

}
