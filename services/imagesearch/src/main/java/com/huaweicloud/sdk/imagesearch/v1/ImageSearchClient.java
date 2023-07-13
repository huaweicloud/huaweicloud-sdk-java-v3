package com.huaweicloud.sdk.imagesearch.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.imagesearch.v1.model.*;

public class ImageSearchClient {

    protected HcClient hcClient;

    public ImageSearchClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ImageSearchClient> newBuilder() {
        return new ClientBuilder<>(ImageSearchClient::new);
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
     * @return RunAddPictureResponse
     */
    public RunAddPictureResponse runAddPicture(RunAddPictureRequest request) {
        return hcClient.syncInvokeHttp(request, ImageSearchMeta.runAddPicture);
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
     * @return SyncInvoker<RunAddPictureRequest, RunAddPictureResponse>
     */
    public SyncInvoker<RunAddPictureRequest, RunAddPictureResponse> runAddPictureInvoker(RunAddPictureRequest request) {
        return new SyncInvoker<RunAddPictureRequest, RunAddPictureResponse>(request, ImageSearchMeta.runAddPicture,
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
     * @return RunCheckPictureResponse
     */
    public RunCheckPictureResponse runCheckPicture(RunCheckPictureRequest request) {
        return hcClient.syncInvokeHttp(request, ImageSearchMeta.runCheckPicture);
    }

    /**
     * 查询图片
     *
     * 通过图片路径查询索引库中对应图片是否存在。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunCheckPictureRequest 请求对象
     * @return SyncInvoker<RunCheckPictureRequest, RunCheckPictureResponse>
     */
    public SyncInvoker<RunCheckPictureRequest, RunCheckPictureResponse> runCheckPictureInvoker(
        RunCheckPictureRequest request) {
        return new SyncInvoker<RunCheckPictureRequest, RunCheckPictureResponse>(request,
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
     * @return RunCreateInstanceResponse
     */
    public RunCreateInstanceResponse runCreateInstance(RunCreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, ImageSearchMeta.runCreateInstance);
    }

    /**
     * 创建实例
     *
     * 创建实例，实例中会生成图片索引库，用来存放图片特征。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunCreateInstanceRequest 请求对象
     * @return SyncInvoker<RunCreateInstanceRequest, RunCreateInstanceResponse>
     */
    public SyncInvoker<RunCreateInstanceRequest, RunCreateInstanceResponse> runCreateInstanceInvoker(
        RunCreateInstanceRequest request) {
        return new SyncInvoker<RunCreateInstanceRequest, RunCreateInstanceResponse>(request,
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
     * @return RunDeleteInstanceResponse
     */
    public RunDeleteInstanceResponse runDeleteInstance(RunDeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, ImageSearchMeta.runDeleteInstance);
    }

    /**
     * 删除实例
     *
     * 删除已存在的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunDeleteInstanceRequest 请求对象
     * @return SyncInvoker<RunDeleteInstanceRequest, RunDeleteInstanceResponse>
     */
    public SyncInvoker<RunDeleteInstanceRequest, RunDeleteInstanceResponse> runDeleteInstanceInvoker(
        RunDeleteInstanceRequest request) {
        return new SyncInvoker<RunDeleteInstanceRequest, RunDeleteInstanceResponse>(request,
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
     * @return RunDeletePictureResponse
     */
    public RunDeletePictureResponse runDeletePicture(RunDeletePictureRequest request) {
        return hcClient.syncInvokeHttp(request, ImageSearchMeta.runDeletePicture);
    }

    /**
     * 删除图片
     *
     * 通过图片路径删除索引库中对应图片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunDeletePictureRequest 请求对象
     * @return SyncInvoker<RunDeletePictureRequest, RunDeletePictureResponse>
     */
    public SyncInvoker<RunDeletePictureRequest, RunDeletePictureResponse> runDeletePictureInvoker(
        RunDeletePictureRequest request) {
        return new SyncInvoker<RunDeletePictureRequest, RunDeletePictureResponse>(request,
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
     * @return RunModifyPictureResponse
     */
    public RunModifyPictureResponse runModifyPicture(RunModifyPictureRequest request) {
        return hcClient.syncInvokeHttp(request, ImageSearchMeta.runModifyPicture);
    }

    /**
     * 修改图片信息
     *
     * 修改图像索引库中已存在的图片信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunModifyPictureRequest 请求对象
     * @return SyncInvoker<RunModifyPictureRequest, RunModifyPictureResponse>
     */
    public SyncInvoker<RunModifyPictureRequest, RunModifyPictureResponse> runModifyPictureInvoker(
        RunModifyPictureRequest request) {
        return new SyncInvoker<RunModifyPictureRequest, RunModifyPictureResponse>(request,
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
     * @return RunQueryInstanceResponse
     */
    public RunQueryInstanceResponse runQueryInstance(RunQueryInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, ImageSearchMeta.runQueryInstance);
    }

    /**
     * 查询用户实例信息
     *
     * 查看用户指定实例详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunQueryInstanceRequest 请求对象
     * @return SyncInvoker<RunQueryInstanceRequest, RunQueryInstanceResponse>
     */
    public SyncInvoker<RunQueryInstanceRequest, RunQueryInstanceResponse> runQueryInstanceInvoker(
        RunQueryInstanceRequest request) {
        return new SyncInvoker<RunQueryInstanceRequest, RunQueryInstanceResponse>(request,
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
     * @return RunSearchPictureResponse
     */
    public RunSearchPictureResponse runSearchPicture(RunSearchPictureRequest request) {
        return hcClient.syncInvokeHttp(request, ImageSearchMeta.runSearchPicture);
    }

    /**
     * 搜索图片
     *
     * 从图片索引库中搜索相似图片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunSearchPictureRequest 请求对象
     * @return SyncInvoker<RunSearchPictureRequest, RunSearchPictureResponse>
     */
    public SyncInvoker<RunSearchPictureRequest, RunSearchPictureResponse> runSearchPictureInvoker(
        RunSearchPictureRequest request) {
        return new SyncInvoker<RunSearchPictureRequest, RunSearchPictureResponse>(request,
            ImageSearchMeta.runSearchPicture, hcClient);
    }

}
