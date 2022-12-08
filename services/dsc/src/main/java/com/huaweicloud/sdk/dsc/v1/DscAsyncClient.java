package com.huaweicloud.sdk.dsc.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dsc.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class DscAsyncClient {

    protected HcClient hcClient;

    public DscAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DscAsyncClient> newBuilder() {
        return new ClientBuilder<>(DscAsyncClient::new);
    }

    /**
     * 添加资产授权
     *
     * 添加数据资产扫描授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddBucketsRequest 请求对象
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
     * @param AddBucketsRequest 请求对象
     * @return AsyncInvoker<AddBucketsRequest, AddBucketsResponse>
     */
    public AsyncInvoker<AddBucketsRequest, AddBucketsResponse> addBucketsAsyncInvoker(AddBucketsRequest request) {
        return new AsyncInvoker<AddBucketsRequest, AddBucketsResponse>(request, DscMeta.addBuckets, hcClient);
    }

    /**
     * 创建扫描规则
     *
     * 根据指定的规则名称、规则类型、风险等级、最小匹配次数等参数创建自定义的敏感数据识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddRuleRequest 请求对象
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
     * @param AddRuleRequest 请求对象
     * @return AsyncInvoker<AddRuleRequest, AddRuleResponse>
     */
    public AsyncInvoker<AddRuleRequest, AddRuleResponse> addRuleAsyncInvoker(AddRuleRequest request) {
        return new AsyncInvoker<AddRuleRequest, AddRuleResponse>(request, DscMeta.addRule, hcClient);
    }

    /**
     * 创建扫描规则组
     *
     * 根据指定的规则组名称和扫描规则列表创建敏感数据扫描规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddRuleGroupRequest 请求对象
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
     * @param AddRuleGroupRequest 请求对象
     * @return AsyncInvoker<AddRuleGroupRequest, AddRuleGroupResponse>
     */
    public AsyncInvoker<AddRuleGroupRequest, AddRuleGroupResponse> addRuleGroupAsyncInvoker(
        AddRuleGroupRequest request) {
        return new AsyncInvoker<AddRuleGroupRequest, AddRuleGroupResponse>(request, DscMeta.addRuleGroup, hcClient);
    }

    /**
     * 创建扫描任务
     *
     * 根据指定的任务名称、扫描方式、扫描周期、扫描规则组、扫描时间创建扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddScanJobRequest 请求对象
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
     * @param AddScanJobRequest 请求对象
     * @return AsyncInvoker<AddScanJobRequest, AddScanJobResponse>
     */
    public AsyncInvoker<AddScanJobRequest, AddScanJobResponse> addScanJobAsyncInvoker(AddScanJobRequest request) {
        return new AsyncInvoker<AddScanJobRequest, AddScanJobResponse>(request, DscMeta.addScanJob, hcClient);
    }

    /**
     * 对数据进行脱敏
     *
     * 对数据进行脱敏
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAddDataMaskRequest 请求对象
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
     * @param BatchAddDataMaskRequest 请求对象
     * @return AsyncInvoker<BatchAddDataMaskRequest, BatchAddDataMaskResponse>
     */
    public AsyncInvoker<BatchAddDataMaskRequest, BatchAddDataMaskResponse> batchAddDataMaskAsyncInvoker(
        BatchAddDataMaskRequest request) {
        return new AsyncInvoker<BatchAddDataMaskRequest, BatchAddDataMaskResponse>(request, DscMeta.batchAddDataMask,
            hcClient);
    }

    /**
     * 开启/停止脱敏任务
     *
     * 开启/停止脱敏任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeDbTemplateOperationRequest 请求对象
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
     * @param ChangeDbTemplateOperationRequest 请求对象
     * @return AsyncInvoker<ChangeDbTemplateOperationRequest, ChangeDbTemplateOperationResponse>
     */
    public AsyncInvoker<ChangeDbTemplateOperationRequest, ChangeDbTemplateOperationResponse> changeDbTemplateOperationAsyncInvoker(
        ChangeDbTemplateOperationRequest request) {
        return new AsyncInvoker<ChangeDbTemplateOperationRequest, ChangeDbTemplateOperationResponse>(request,
            DscMeta.changeDbTemplateOperation, hcClient);
    }

    /**
     * 修改扫描规则
     *
     * 修改自定义的敏感数据识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeRuleRequest 请求对象
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
     * @param ChangeRuleRequest 请求对象
     * @return AsyncInvoker<ChangeRuleRequest, ChangeRuleResponse>
     */
    public AsyncInvoker<ChangeRuleRequest, ChangeRuleResponse> changeRuleAsyncInvoker(ChangeRuleRequest request) {
        return new AsyncInvoker<ChangeRuleRequest, ChangeRuleResponse>(request, DscMeta.changeRule, hcClient);
    }

    /**
     * 嵌入数据水印
     *
     * 对json体中数据动态添加水印
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseWaterMarkRequest 请求对象
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
     * @param CreateDatabaseWaterMarkRequest 请求对象
     * @return AsyncInvoker<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse>
     */
    public AsyncInvoker<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse> createDatabaseWaterMarkAsyncInvoker(
        CreateDatabaseWaterMarkRequest request) {
        return new AsyncInvoker<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse>(request,
            DscMeta.createDatabaseWaterMark, hcClient);
    }

    /**
     * 文档嵌入水印
     *
     * 对WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf) 类型的文件嵌入文字暗水印、文字明水印或者图片明水印，用户以formData的格式传入待加水印的文件和水印相关信息，DSC服务给文件加完水印后返回给用户已嵌入水印的文件的二进制流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDocWatermarkRequest 请求对象
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
     * @param CreateDocWatermarkRequest 请求对象
     * @return AsyncInvoker<CreateDocWatermarkRequest, CreateDocWatermarkResponse>
     */
    public AsyncInvoker<CreateDocWatermarkRequest, CreateDocWatermarkResponse> createDocWatermarkAsyncInvoker(
        CreateDocWatermarkRequest request) {
        return new AsyncInvoker<CreateDocWatermarkRequest, CreateDocWatermarkResponse>(request,
            DscMeta.createDocWatermark, hcClient);
    }

    /**
     * 文档嵌入水印（文件地址版本）
     *
     * 对WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)*类型的文档嵌入文字暗水印、文字明水印或者图片明水印，用户传入待加水印的文档地址（目前支持OBS)和水印相关信息，DSC服务对文档加完水印后返回给用户已嵌入水印的文档的存放地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDocWatermarkByAddressRequest 请求对象
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
     * @param CreateDocWatermarkByAddressRequest 请求对象
     * @return AsyncInvoker<CreateDocWatermarkByAddressRequest, CreateDocWatermarkByAddressResponse>
     */
    public AsyncInvoker<CreateDocWatermarkByAddressRequest, CreateDocWatermarkByAddressResponse> createDocWatermarkByAddressAsyncInvoker(
        CreateDocWatermarkByAddressRequest request) {
        return new AsyncInvoker<CreateDocWatermarkByAddressRequest, CreateDocWatermarkByAddressResponse>(request,
            DscMeta.createDocWatermarkByAddress, hcClient);
    }

    /**
     * 图片嵌入暗水印
     *
     * 对图片嵌入文字暗水印或者图片暗水印，用户以formData的格式传入待加水印图片和水印相关信息，DSC服务对图片加完水印后返回给用户已嵌入水印的图片二进制流，目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageWatermarkRequest 请求对象
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
     * @param CreateImageWatermarkRequest 请求对象
     * @return AsyncInvoker<CreateImageWatermarkRequest, CreateImageWatermarkResponse>
     */
    public AsyncInvoker<CreateImageWatermarkRequest, CreateImageWatermarkResponse> createImageWatermarkAsyncInvoker(
        CreateImageWatermarkRequest request) {
        return new AsyncInvoker<CreateImageWatermarkRequest, CreateImageWatermarkResponse>(request,
            DscMeta.createImageWatermark, hcClient);
    }

    /**
     * 图片嵌入暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的图片嵌入文字暗水印或者图片暗水印，已嵌入的水印的图片将存放在用户指定的位置（目前支持华为云OBS），支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageWatermarkByAddressRequest 请求对象
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
     * @param CreateImageWatermarkByAddressRequest 请求对象
     * @return AsyncInvoker<CreateImageWatermarkByAddressRequest, CreateImageWatermarkByAddressResponse>
     */
    public AsyncInvoker<CreateImageWatermarkByAddressRequest, CreateImageWatermarkByAddressResponse> createImageWatermarkByAddressAsyncInvoker(
        CreateImageWatermarkByAddressRequest request) {
        return new AsyncInvoker<CreateImageWatermarkByAddressRequest, CreateImageWatermarkByAddressResponse>(request,
            DscMeta.createImageWatermarkByAddress, hcClient);
    }

    /**
     * 实例下单
     *
     * 根据计费方式、计费周期等信息进行实例下单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProductOrderRequest 请求对象
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
     * @param CreateProductOrderRequest 请求对象
     * @return AsyncInvoker<CreateProductOrderRequest, CreateProductOrderResponse>
     */
    public AsyncInvoker<CreateProductOrderRequest, CreateProductOrderResponse> createProductOrderAsyncInvoker(
        CreateProductOrderRequest request) {
        return new AsyncInvoker<CreateProductOrderRequest, CreateProductOrderResponse>(request,
            DscMeta.createProductOrder, hcClient);
    }

    /**
     * 删除资产授权
     *
     * 删除数据资产扫描授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBucketRequest 请求对象
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
     * @param DeleteBucketRequest 请求对象
     * @return AsyncInvoker<DeleteBucketRequest, DeleteBucketResponse>
     */
    public AsyncInvoker<DeleteBucketRequest, DeleteBucketResponse> deleteBucketAsyncInvoker(
        DeleteBucketRequest request) {
        return new AsyncInvoker<DeleteBucketRequest, DeleteBucketResponse>(request, DscMeta.deleteBucket, hcClient);
    }

    /**
     * 删除扫描规则
     *
     * 删除指定的敏感数据识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRuleRequest 请求对象
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
     * @param DeleteRuleRequest 请求对象
     * @return AsyncInvoker<DeleteRuleRequest, DeleteRuleResponse>
     */
    public AsyncInvoker<DeleteRuleRequest, DeleteRuleResponse> deleteRuleAsyncInvoker(DeleteRuleRequest request) {
        return new AsyncInvoker<DeleteRuleRequest, DeleteRuleResponse>(request, DscMeta.deleteRule, hcClient);
    }

    /**
     * 删除扫描规则组
     *
     * 根据扫描规则组ID删除指定的扫描规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRuleGroupRequest 请求对象
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
     * @param DeleteRuleGroupRequest 请求对象
     * @return AsyncInvoker<DeleteRuleGroupRequest, DeleteRuleGroupResponse>
     */
    public AsyncInvoker<DeleteRuleGroupRequest, DeleteRuleGroupResponse> deleteRuleGroupAsyncInvoker(
        DeleteRuleGroupRequest request) {
        return new AsyncInvoker<DeleteRuleGroupRequest, DeleteRuleGroupResponse>(request, DscMeta.deleteRuleGroup,
            hcClient);
    }

    /**
     * 查看资产列表
     *
     * 查询数据资产扫描授权列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBucketsRequest 请求对象
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
     * @param ListBucketsRequest 请求对象
     * @return AsyncInvoker<ListBucketsRequest, ListBucketsResponse>
     */
    public AsyncInvoker<ListBucketsRequest, ListBucketsResponse> listBucketsAsyncInvoker(ListBucketsRequest request) {
        return new AsyncInvoker<ListBucketsRequest, ListBucketsResponse>(request, DscMeta.listBuckets, hcClient);
    }

    /**
     * 查询脱敏任务执行列表
     *
     * 查询脱敏任务执行列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDbMaskTaskRequest 请求对象
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
     * @param ListDbMaskTaskRequest 请求对象
     * @return AsyncInvoker<ListDbMaskTaskRequest, ListDbMaskTaskResponse>
     */
    public AsyncInvoker<ListDbMaskTaskRequest, ListDbMaskTaskResponse> listDbMaskTaskAsyncInvoker(
        ListDbMaskTaskRequest request) {
        return new AsyncInvoker<ListDbMaskTaskRequest, ListDbMaskTaskResponse>(request, DscMeta.listDbMaskTask,
            hcClient);
    }

    /**
     * OBS血缘图桶级查询
     *
     * OBS血缘图桶级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRelationBucketsRequest 请求对象
     * @return CompletableFuture<ListRelationBucketsResponse>
     */
    public CompletableFuture<ListRelationBucketsResponse> listRelationBucketsAsync(ListRelationBucketsRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.listRelationBuckets);
    }

    /**
     * OBS血缘图桶级查询
     *
     * OBS血缘图桶级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRelationBucketsRequest 请求对象
     * @return AsyncInvoker<ListRelationBucketsRequest, ListRelationBucketsResponse>
     */
    public AsyncInvoker<ListRelationBucketsRequest, ListRelationBucketsResponse> listRelationBucketsAsyncInvoker(
        ListRelationBucketsRequest request) {
        return new AsyncInvoker<ListRelationBucketsRequest, ListRelationBucketsResponse>(request,
            DscMeta.listRelationBuckets, hcClient);
    }

    /**
     * 数据库血缘图表字段级查询
     *
     * 数据库血缘图表字段级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRelationColumnRequest 请求对象
     * @return CompletableFuture<ListRelationColumnResponse>
     */
    public CompletableFuture<ListRelationColumnResponse> listRelationColumnAsync(ListRelationColumnRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.listRelationColumn);
    }

    /**
     * 数据库血缘图表字段级查询
     *
     * 数据库血缘图表字段级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRelationColumnRequest 请求对象
     * @return AsyncInvoker<ListRelationColumnRequest, ListRelationColumnResponse>
     */
    public AsyncInvoker<ListRelationColumnRequest, ListRelationColumnResponse> listRelationColumnAsyncInvoker(
        ListRelationColumnRequest request) {
        return new AsyncInvoker<ListRelationColumnRequest, ListRelationColumnResponse>(request,
            DscMeta.listRelationColumn, hcClient);
    }

    /**
     * 数据库血缘图数据库级查询
     *
     * 数据库血缘图数据库级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRelationDbRequest 请求对象
     * @return CompletableFuture<ListRelationDbResponse>
     */
    public CompletableFuture<ListRelationDbResponse> listRelationDbAsync(ListRelationDbRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.listRelationDb);
    }

    /**
     * 数据库血缘图数据库级查询
     *
     * 数据库血缘图数据库级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRelationDbRequest 请求对象
     * @return AsyncInvoker<ListRelationDbRequest, ListRelationDbResponse>
     */
    public AsyncInvoker<ListRelationDbRequest, ListRelationDbResponse> listRelationDbAsyncInvoker(
        ListRelationDbRequest request) {
        return new AsyncInvoker<ListRelationDbRequest, ListRelationDbResponse>(request, DscMeta.listRelationDb,
            hcClient);
    }

    /**
     * OBS血缘图文件分页查询
     *
     * OBS血缘图文件分页查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRelationFileRequest 请求对象
     * @return CompletableFuture<ListRelationFileResponse>
     */
    public CompletableFuture<ListRelationFileResponse> listRelationFileAsync(ListRelationFileRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.listRelationFile);
    }

    /**
     * OBS血缘图文件分页查询
     *
     * OBS血缘图文件分页查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRelationFileRequest 请求对象
     * @return AsyncInvoker<ListRelationFileRequest, ListRelationFileResponse>
     */
    public AsyncInvoker<ListRelationFileRequest, ListRelationFileResponse> listRelationFileAsyncInvoker(
        ListRelationFileRequest request) {
        return new AsyncInvoker<ListRelationFileRequest, ListRelationFileResponse>(request, DscMeta.listRelationFile,
            hcClient);
    }

    /**
     * 数据库血缘图表分页查询
     *
     * 数据库血缘图表分页查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRelationTableRequest 请求对象
     * @return CompletableFuture<ListRelationTableResponse>
     */
    public CompletableFuture<ListRelationTableResponse> listRelationTableAsync(ListRelationTableRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.listRelationTable);
    }

    /**
     * 数据库血缘图表分页查询
     *
     * 数据库血缘图表分页查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRelationTableRequest 请求对象
     * @return AsyncInvoker<ListRelationTableRequest, ListRelationTableResponse>
     */
    public AsyncInvoker<ListRelationTableRequest, ListRelationTableResponse> listRelationTableAsyncInvoker(
        ListRelationTableRequest request) {
        return new AsyncInvoker<ListRelationTableRequest, ListRelationTableResponse>(request, DscMeta.listRelationTable,
            hcClient);
    }

    /**
     * 查询扫描规则组列表
     *
     * 根据指定的项目ID查询扫描规则组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRuleGroupsRequest 请求对象
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
     * @param ListRuleGroupsRequest 请求对象
     * @return AsyncInvoker<ListRuleGroupsRequest, ListRuleGroupsResponse>
     */
    public AsyncInvoker<ListRuleGroupsRequest, ListRuleGroupsResponse> listRuleGroupsAsyncInvoker(
        ListRuleGroupsRequest request) {
        return new AsyncInvoker<ListRuleGroupsRequest, ListRuleGroupsResponse>(request, DscMeta.listRuleGroups,
            hcClient);
    }

    /**
     * 提取数据水印
     *
     * 提取请求数据中水印内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDatabaseWaterMarkRequest 请求对象
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
     * @param ShowDatabaseWaterMarkRequest 请求对象
     * @return AsyncInvoker<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse>
     */
    public AsyncInvoker<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse> showDatabaseWaterMarkAsyncInvoker(
        ShowDatabaseWaterMarkRequest request) {
        return new AsyncInvoker<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse>(request,
            DscMeta.showDatabaseWaterMark, hcClient);
    }

    /**
     * 文档提取暗水印
     *
     * 对已嵌入文字暗水印的WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)类型的文档进行文字暗水印提取，用户以formData的格式传入待提取水印的文件，DSC服务以JSON的格式返回从文档里提取的出的文字暗水印内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDocWatermarkRequest 请求对象
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
     * @param ShowDocWatermarkRequest 请求对象
     * @return AsyncInvoker<ShowDocWatermarkRequest, ShowDocWatermarkResponse>
     */
    public AsyncInvoker<ShowDocWatermarkRequest, ShowDocWatermarkResponse> showDocWatermarkAsyncInvoker(
        ShowDocWatermarkRequest request) {
        return new AsyncInvoker<ShowDocWatermarkRequest, ShowDocWatermarkResponse>(request, DscMeta.showDocWatermark,
            hcClient);
    }

    /**
     * 文档提取暗水印（文档地址版本）
     *
     * 支持对已嵌入文字暗水印的WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)类型的文档进行水印提取，用户传入待提取水印的文档地址（目前支持OBS），DSC服务以JSON的格式返回从文档里提取的出的文字暗水印内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDocWatermarkByAddressRequest 请求对象
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
     * @param ShowDocWatermarkByAddressRequest 请求对象
     * @return AsyncInvoker<ShowDocWatermarkByAddressRequest, ShowDocWatermarkByAddressResponse>
     */
    public AsyncInvoker<ShowDocWatermarkByAddressRequest, ShowDocWatermarkByAddressResponse> showDocWatermarkByAddressAsyncInvoker(
        ShowDocWatermarkByAddressRequest request) {
        return new AsyncInvoker<ShowDocWatermarkByAddressRequest, ShowDocWatermarkByAddressResponse>(request,
            DscMeta.showDocWatermarkByAddress, hcClient);
    }

    /**
     * 提取图片中的文字暗水印
     *
     * 对已嵌入文字暗水印的图片进行水印提取，用户以formData的格式传入待提取水印的图片，DSC服务以JSON的格式返回从图片里提取的出的文字暗水印。目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageWatermarkRequest 请求对象
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
     * @param ShowImageWatermarkRequest 请求对象
     * @return AsyncInvoker<ShowImageWatermarkRequest, ShowImageWatermarkResponse>
     */
    public AsyncInvoker<ShowImageWatermarkRequest, ShowImageWatermarkResponse> showImageWatermarkAsyncInvoker(
        ShowImageWatermarkRequest request) {
        return new AsyncInvoker<ShowImageWatermarkRequest, ShowImageWatermarkResponse>(request,
            DscMeta.showImageWatermark, hcClient);
    }

    /**
     * 提取图片中的文字暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的已嵌入文字暗水印的图片提取文字暗水印，支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageWatermarkByAddressRequest 请求对象
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
     * @param ShowImageWatermarkByAddressRequest 请求对象
     * @return AsyncInvoker<ShowImageWatermarkByAddressRequest, ShowImageWatermarkByAddressResponse>
     */
    public AsyncInvoker<ShowImageWatermarkByAddressRequest, ShowImageWatermarkByAddressResponse> showImageWatermarkByAddressAsyncInvoker(
        ShowImageWatermarkByAddressRequest request) {
        return new AsyncInvoker<ShowImageWatermarkByAddressRequest, ShowImageWatermarkByAddressResponse>(request,
            DscMeta.showImageWatermarkByAddress, hcClient);
    }

    /**
     * 提取图片中的图片暗水印
     *
     * 对已嵌入图片暗水印的图片进行水印提取，用户以formData的格式传入待提取水印的图片，DSC服务以图片二进制流的格式返回从图片里提取的出的图片暗水印。目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageWatermarkWithImageRequest 请求对象
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
     * @param ShowImageWatermarkWithImageRequest 请求对象
     * @return AsyncInvoker<ShowImageWatermarkWithImageRequest, ShowImageWatermarkWithImageResponse>
     */
    public AsyncInvoker<ShowImageWatermarkWithImageRequest, ShowImageWatermarkWithImageResponse> showImageWatermarkWithImageAsyncInvoker(
        ShowImageWatermarkWithImageRequest request) {
        return new AsyncInvoker<ShowImageWatermarkWithImageRequest, ShowImageWatermarkWithImageResponse>(request,
            DscMeta.showImageWatermarkWithImage, hcClient);
    }

    /**
     * 提取图片中的图片暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的已嵌入图片暗水印的图片提取图片暗水印，提取出的水印图片将存放在用户指定的位置（目前支持华为云OBS），支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageWatermarkWithImageByAddressRequest 请求对象
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
     * @param ShowImageWatermarkWithImageByAddressRequest 请求对象
     * @return AsyncInvoker<ShowImageWatermarkWithImageByAddressRequest, ShowImageWatermarkWithImageByAddressResponse>
     */
    public AsyncInvoker<ShowImageWatermarkWithImageByAddressRequest, ShowImageWatermarkWithImageByAddressResponse> showImageWatermarkWithImageByAddressAsyncInvoker(
        ShowImageWatermarkWithImageByAddressRequest request) {
        return new AsyncInvoker<ShowImageWatermarkWithImageByAddressRequest, ShowImageWatermarkWithImageByAddressResponse>(
            request, DscMeta.showImageWatermarkWithImageByAddress, hcClient);
    }

    /**
     * 查看规则列表
     *
     * 查询扫描规则列表，返回扫描规则总数和扫描规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRulesRequest 请求对象
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
     * @param ShowRulesRequest 请求对象
     * @return AsyncInvoker<ShowRulesRequest, ShowRulesResponse>
     */
    public AsyncInvoker<ShowRulesRequest, ShowRulesResponse> showRulesAsyncInvoker(ShowRulesRequest request) {
        return new AsyncInvoker<ShowRulesRequest, ShowRulesResponse>(request, DscMeta.showRules, hcClient);
    }

    /**
     * 查询指定任务扫描结果
     *
     * 查询指定任务扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowScanJobResultsRequest 请求对象
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
     * @param ShowScanJobResultsRequest 请求对象
     * @return AsyncInvoker<ShowScanJobResultsRequest, ShowScanJobResultsResponse>
     */
    public AsyncInvoker<ShowScanJobResultsRequest, ShowScanJobResultsResponse> showScanJobResultsAsyncInvoker(
        ShowScanJobResultsRequest request) {
        return new AsyncInvoker<ShowScanJobResultsRequest, ShowScanJobResultsResponse>(request,
            DscMeta.showScanJobResults, hcClient);
    }

    /**
     * 查询扫描任务列表
     *
     * 查询扫描任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowScanJobsRequest 请求对象
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
     * @param ShowScanJobsRequest 请求对象
     * @return AsyncInvoker<ShowScanJobsRequest, ShowScanJobsResponse>
     */
    public AsyncInvoker<ShowScanJobsRequest, ShowScanJobsResponse> showScanJobsAsyncInvoker(
        ShowScanJobsRequest request) {
        return new AsyncInvoker<ShowScanJobsRequest, ShowScanJobsResponse>(request, DscMeta.showScanJobs, hcClient);
    }

    /**
     * 查询资源开通信息
     *
     * 查询资源开通信息，根据项目ID查询订单详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSpecificationRequest 请求对象
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
     * @param ShowSpecificationRequest 请求对象
     * @return AsyncInvoker<ShowSpecificationRequest, ShowSpecificationResponse>
     */
    public AsyncInvoker<ShowSpecificationRequest, ShowSpecificationResponse> showSpecificationAsyncInvoker(
        ShowSpecificationRequest request) {
        return new AsyncInvoker<ShowSpecificationRequest, ShowSpecificationResponse>(request, DscMeta.showSpecification,
            hcClient);
    }

    /**
     * 查询告警通知主题
     *
     * 查询告警通知主题，返回默认主题、已确认主题数量及列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTopicsRequest 请求对象
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
     * @param ShowTopicsRequest 请求对象
     * @return AsyncInvoker<ShowTopicsRequest, ShowTopicsResponse>
     */
    public AsyncInvoker<ShowTopicsRequest, ShowTopicsResponse> showTopicsAsyncInvoker(ShowTopicsRequest request) {
        return new AsyncInvoker<ShowTopicsRequest, ShowTopicsResponse>(request, DscMeta.showTopics, hcClient);
    }

    /**
     * 编辑资产名称
     *
     * 编辑数据资产名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAssetNameRequest 请求对象
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
     * @param UpdateAssetNameRequest 请求对象
     * @return AsyncInvoker<UpdateAssetNameRequest, UpdateAssetNameResponse>
     */
    public AsyncInvoker<UpdateAssetNameRequest, UpdateAssetNameResponse> updateAssetNameAsyncInvoker(
        UpdateAssetNameRequest request) {
        return new AsyncInvoker<UpdateAssetNameRequest, UpdateAssetNameResponse>(request, DscMeta.updateAssetName,
            hcClient);
    }

    /**
     * 修改告警通知主题
     *
     * 修改告警通知的关联项目ID、通知主题、通知状态(0为关闭通知，1为开启通知)等通用配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDefaultTopicRequest 请求对象
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
     * @param UpdateDefaultTopicRequest 请求对象
     * @return AsyncInvoker<UpdateDefaultTopicRequest, UpdateDefaultTopicResponse>
     */
    public AsyncInvoker<UpdateDefaultTopicRequest, UpdateDefaultTopicResponse> updateDefaultTopicAsyncInvoker(
        UpdateDefaultTopicRequest request) {
        return new AsyncInvoker<UpdateDefaultTopicRequest, UpdateDefaultTopicResponse>(request,
            DscMeta.updateDefaultTopic, hcClient);
    }

    /**
     * 查询OpenApi调用记录
     *
     * 查询OpenApi调用记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOpenApiCalledRecordsRequest 请求对象
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
     * @param ShowOpenApiCalledRecordsRequest 请求对象
     * @return AsyncInvoker<ShowOpenApiCalledRecordsRequest, ShowOpenApiCalledRecordsResponse>
     */
    public AsyncInvoker<ShowOpenApiCalledRecordsRequest, ShowOpenApiCalledRecordsResponse> showOpenApiCalledRecordsAsyncInvoker(
        ShowOpenApiCalledRecordsRequest request) {
        return new AsyncInvoker<ShowOpenApiCalledRecordsRequest, ShowOpenApiCalledRecordsResponse>(request,
            DscMeta.showOpenApiCalledRecords, hcClient);
    }

}
