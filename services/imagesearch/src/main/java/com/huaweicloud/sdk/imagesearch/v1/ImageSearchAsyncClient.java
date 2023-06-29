package com.huaweicloud.sdk.imagesearch.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.imagesearch.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class ImageSearchAsyncClient {

    protected HcClient hcClient;

    public ImageSearchAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ImageSearchAsyncClient> newBuilder() {
        return new ClientBuilder<>(ImageSearchAsyncClient::new);
    }

    /**
     * 添加图片
     *
     * 添加图片
     * 将图片导入图片索引库，该图片可以是同一区域OBS桶内的图片或请求消息体里的图片，只有导入图片索引库的图片方可被搜索到。
     * 
     * &gt; - 添加或搜索的图片存储在OBS的桶中时，需要对OBS的桶授权。在图像搜索服务管理控制台“实例管理”页面，单击实例操作列的“离线导入”，进入“离线导入”页面。选择存放数据的OBS桶，单击“授权”按钮，字体显示为灰色即完成OBS授权访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunAddPictureRequest 请求对象
     * @return CompletableFuture<RunAddPictureResponse>
     */
    public CompletableFuture<RunAddPictureResponse> runAddPictureAsync(RunAddPictureRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageSearchMeta.runAddPicture);
    }

    /**
     * 添加图片
     *
     * 添加图片
     * 将图片导入图片索引库，该图片可以是同一区域OBS桶内的图片或请求消息体里的图片，只有导入图片索引库的图片方可被搜索到。
     * 
     * &gt; - 添加或搜索的图片存储在OBS的桶中时，需要对OBS的桶授权。在图像搜索服务管理控制台“实例管理”页面，单击实例操作列的“离线导入”，进入“离线导入”页面。选择存放数据的OBS桶，单击“授权”按钮，字体显示为灰色即完成OBS授权访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunAddPictureRequest 请求对象
     * @return AsyncInvoker<RunAddPictureRequest, RunAddPictureResponse>
     */
    public AsyncInvoker<RunAddPictureRequest, RunAddPictureResponse> runAddPictureAsyncInvoker(
        RunAddPictureRequest request) {
        return new AsyncInvoker<RunAddPictureRequest, RunAddPictureResponse>(request, ImageSearchMeta.runAddPicture,
            hcClient);
    }

    /**
     * 查询图片
     *
     * 通过图片路径查询索引库中对应图片是否存在。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunCheckPictureRequest 请求对象
     * @return CompletableFuture<RunCheckPictureResponse>
     */
    public CompletableFuture<RunCheckPictureResponse> runCheckPictureAsync(RunCheckPictureRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageSearchMeta.runCheckPicture);
    }

    /**
     * 查询图片
     *
     * 通过图片路径查询索引库中对应图片是否存在。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunCheckPictureRequest 请求对象
     * @return AsyncInvoker<RunCheckPictureRequest, RunCheckPictureResponse>
     */
    public AsyncInvoker<RunCheckPictureRequest, RunCheckPictureResponse> runCheckPictureAsyncInvoker(
        RunCheckPictureRequest request) {
        return new AsyncInvoker<RunCheckPictureRequest, RunCheckPictureResponse>(request,
            ImageSearchMeta.runCheckPicture, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建实例，实例中会生成图片索引库，用来存放图片特征。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunCreateInstanceRequest 请求对象
     * @return CompletableFuture<RunCreateInstanceResponse>
     */
    public CompletableFuture<RunCreateInstanceResponse> runCreateInstanceAsync(RunCreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageSearchMeta.runCreateInstance);
    }

    /**
     * 创建实例
     *
     * 创建实例，实例中会生成图片索引库，用来存放图片特征。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunCreateInstanceRequest 请求对象
     * @return AsyncInvoker<RunCreateInstanceRequest, RunCreateInstanceResponse>
     */
    public AsyncInvoker<RunCreateInstanceRequest, RunCreateInstanceResponse> runCreateInstanceAsyncInvoker(
        RunCreateInstanceRequest request) {
        return new AsyncInvoker<RunCreateInstanceRequest, RunCreateInstanceResponse>(request,
            ImageSearchMeta.runCreateInstance, hcClient);
    }

    /**
     * 删除实例
     *
     * 删除已存在的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunDeleteInstanceRequest 请求对象
     * @return CompletableFuture<RunDeleteInstanceResponse>
     */
    public CompletableFuture<RunDeleteInstanceResponse> runDeleteInstanceAsync(RunDeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageSearchMeta.runDeleteInstance);
    }

    /**
     * 删除实例
     *
     * 删除已存在的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunDeleteInstanceRequest 请求对象
     * @return AsyncInvoker<RunDeleteInstanceRequest, RunDeleteInstanceResponse>
     */
    public AsyncInvoker<RunDeleteInstanceRequest, RunDeleteInstanceResponse> runDeleteInstanceAsyncInvoker(
        RunDeleteInstanceRequest request) {
        return new AsyncInvoker<RunDeleteInstanceRequest, RunDeleteInstanceResponse>(request,
            ImageSearchMeta.runDeleteInstance, hcClient);
    }

    /**
     * 删除图片
     *
     * 通过图片路径删除索引库中对应图片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunDeletePictureRequest 请求对象
     * @return CompletableFuture<RunDeletePictureResponse>
     */
    public CompletableFuture<RunDeletePictureResponse> runDeletePictureAsync(RunDeletePictureRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageSearchMeta.runDeletePicture);
    }

    /**
     * 删除图片
     *
     * 通过图片路径删除索引库中对应图片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunDeletePictureRequest 请求对象
     * @return AsyncInvoker<RunDeletePictureRequest, RunDeletePictureResponse>
     */
    public AsyncInvoker<RunDeletePictureRequest, RunDeletePictureResponse> runDeletePictureAsyncInvoker(
        RunDeletePictureRequest request) {
        return new AsyncInvoker<RunDeletePictureRequest, RunDeletePictureResponse>(request,
            ImageSearchMeta.runDeletePicture, hcClient);
    }

    /**
     * 修改图片信息
     *
     * 修改图像索引库中已存在的图片信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunModifyPictureRequest 请求对象
     * @return CompletableFuture<RunModifyPictureResponse>
     */
    public CompletableFuture<RunModifyPictureResponse> runModifyPictureAsync(RunModifyPictureRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageSearchMeta.runModifyPicture);
    }

    /**
     * 修改图片信息
     *
     * 修改图像索引库中已存在的图片信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunModifyPictureRequest 请求对象
     * @return AsyncInvoker<RunModifyPictureRequest, RunModifyPictureResponse>
     */
    public AsyncInvoker<RunModifyPictureRequest, RunModifyPictureResponse> runModifyPictureAsyncInvoker(
        RunModifyPictureRequest request) {
        return new AsyncInvoker<RunModifyPictureRequest, RunModifyPictureResponse>(request,
            ImageSearchMeta.runModifyPicture, hcClient);
    }

    /**
     * 查询用户实例信息
     *
     * 查看用户指定实例详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunQueryInstanceRequest 请求对象
     * @return CompletableFuture<RunQueryInstanceResponse>
     */
    public CompletableFuture<RunQueryInstanceResponse> runQueryInstanceAsync(RunQueryInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageSearchMeta.runQueryInstance);
    }

    /**
     * 查询用户实例信息
     *
     * 查看用户指定实例详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunQueryInstanceRequest 请求对象
     * @return AsyncInvoker<RunQueryInstanceRequest, RunQueryInstanceResponse>
     */
    public AsyncInvoker<RunQueryInstanceRequest, RunQueryInstanceResponse> runQueryInstanceAsyncInvoker(
        RunQueryInstanceRequest request) {
        return new AsyncInvoker<RunQueryInstanceRequest, RunQueryInstanceResponse>(request,
            ImageSearchMeta.runQueryInstance, hcClient);
    }

    /**
     * 搜索图片
     *
     * 从图片索引库中搜索相似图片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunSearchPictureRequest 请求对象
     * @return CompletableFuture<RunSearchPictureResponse>
     */
    public CompletableFuture<RunSearchPictureResponse> runSearchPictureAsync(RunSearchPictureRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageSearchMeta.runSearchPicture);
    }

    /**
     * 搜索图片
     *
     * 从图片索引库中搜索相似图片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunSearchPictureRequest 请求对象
     * @return AsyncInvoker<RunSearchPictureRequest, RunSearchPictureResponse>
     */
    public AsyncInvoker<RunSearchPictureRequest, RunSearchPictureResponse> runSearchPictureAsyncInvoker(
        RunSearchPictureRequest request) {
        return new AsyncInvoker<RunSearchPictureRequest, RunSearchPictureResponse>(request,
            ImageSearchMeta.runSearchPicture, hcClient);
    }

}
