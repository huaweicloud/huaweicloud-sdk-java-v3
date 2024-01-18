package com.huaweicloud.sdk.obs.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.obs.v1.model.CopyObjectRequest;
import com.huaweicloud.sdk.obs.v1.model.CopyObjectResponse;
import com.huaweicloud.sdk.obs.v1.model.CreateBucketRequest;
import com.huaweicloud.sdk.obs.v1.model.CreateBucketResponse;
import com.huaweicloud.sdk.obs.v1.model.DeleteBucketCustomdomainRequest;
import com.huaweicloud.sdk.obs.v1.model.DeleteBucketCustomdomainResponse;
import com.huaweicloud.sdk.obs.v1.model.DeleteBucketRequest;
import com.huaweicloud.sdk.obs.v1.model.DeleteBucketResponse;
import com.huaweicloud.sdk.obs.v1.model.DeleteObjectRequest;
import com.huaweicloud.sdk.obs.v1.model.DeleteObjectResponse;
import com.huaweicloud.sdk.obs.v1.model.DeleteObjectsRequest;
import com.huaweicloud.sdk.obs.v1.model.DeleteObjectsResponse;
import com.huaweicloud.sdk.obs.v1.model.GetBucketAclRequest;
import com.huaweicloud.sdk.obs.v1.model.GetBucketAclResponse;
import com.huaweicloud.sdk.obs.v1.model.GetBucketCustomdomainRequest;
import com.huaweicloud.sdk.obs.v1.model.GetBucketCustomdomainResponse;
import com.huaweicloud.sdk.obs.v1.model.GetBucketMetadataRequest;
import com.huaweicloud.sdk.obs.v1.model.GetBucketMetadataResponse;
import com.huaweicloud.sdk.obs.v1.model.GetBucketNotificationRequest;
import com.huaweicloud.sdk.obs.v1.model.GetBucketNotificationResponse;
import com.huaweicloud.sdk.obs.v1.model.GetObjectMetadataRequest;
import com.huaweicloud.sdk.obs.v1.model.GetObjectMetadataResponse;
import com.huaweicloud.sdk.obs.v1.model.GetObjectRequest;
import com.huaweicloud.sdk.obs.v1.model.GetObjectResponse;
import com.huaweicloud.sdk.obs.v1.model.ListBucketsRequest;
import com.huaweicloud.sdk.obs.v1.model.ListBucketsResponse;
import com.huaweicloud.sdk.obs.v1.model.ListObjectsRequest;
import com.huaweicloud.sdk.obs.v1.model.ListObjectsResponse;
import com.huaweicloud.sdk.obs.v1.model.PutObjectRequest;
import com.huaweicloud.sdk.obs.v1.model.PutObjectResponse;
import com.huaweicloud.sdk.obs.v1.model.SetBucketAclRequest;
import com.huaweicloud.sdk.obs.v1.model.SetBucketAclResponse;
import com.huaweicloud.sdk.obs.v1.model.SetBucketCustomedomainRequest;
import com.huaweicloud.sdk.obs.v1.model.SetBucketCustomedomainResponse;
import com.huaweicloud.sdk.obs.v1.model.SetBucketNotificationRequest;
import com.huaweicloud.sdk.obs.v1.model.SetBucketNotificationResponse;

import java.util.concurrent.CompletableFuture;

public class ObsAsyncClient {

    protected HcClient hcClient;

    public ObsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ObsAsyncClient> newBuilder() {
        ClientBuilder<ObsAsyncClient> clientBuilder = new ClientBuilder<>(ObsAsyncClient::new, "ObsCredentials");
        return clientBuilder;
    }

    /**
     * 复制对象
     *
     * 复制对象（Copy Object）特性用来为OBS上已经存在的对象创建一个副本。
     * 
     * 当进行复制对象操作时，目标对象默认复制源对象的元数据；用户也可以将目标对象的元数据替换为本次请求中所带的元数据。新建的目标对象不会复制源对象的ACL信息，默认的新建对象的ACL是private，用户可以使用设置ACL的操作接口来重新设定新对象的ACL。
     * 
     * 复制对象操作的请求需要通过头域携带拷贝的原桶和对象信息，不能携带消息实体。
     * 
     * 该操作支持服务端加密功能。
     * 
     * 目标对象大小范围是[0, 5GB]，如果源对象大小超过5GB，只能使用Range拷贝部分对象。
     * 
     * #### 多版本 ####
     * 默认情况下，x-obs-copy-source标识复制源对象的最新版本。如果源对象的最新版本是删除标记，则认为该对象已删除。要复制指定版本的对象，可以在x-obs-copy-source请求消息头中携带versionId参数。
     * 
     * 如果目标对象的桶的多版本状态是开启的，系统为目标对象生成唯一的版本号（此版本号与源对象的版本号不同），并且会在响应报头x-obs-version-id返回该版本号。如果目标对象的桶的多版本状态是暂停的，则目标对象的版本号为null。
     * 
     * 须知：
     * 在桶没有开启多版本的情况下，将源对象object_A复制为目标对象object_B，如果在复制操作之前对象object_B已经存在，复制操作执行之后老对象object_B则会被新复制对象object_B覆盖，复制成功后，只能下载到新的对象object_B，老对象object_B将会被删除。因此在使用copy接口时请确保目标对象不存在或者已无价值，避免因copy导致数据误删除。复制过程中源对象object_A无任何变化。
     * 
     * 复制对象的结果不能仅根据HTTP返回头域中的status_code来判断请求是否成功，头域中status_code返回200时表示服务端已经收到请求，且开始处理复制对象请求。复制是否成功会在响应消息的body中，只有body体中有ETag标签才表示成功，否则表示复制失败。
     * 
     * #### 归档存储对象 ####
     * 如果源对象是归档存储对象，需要判断源对象的取回状态，只有当源对象处于已取回状态时，才能复制成功。源对象未取回或者正在取回时，会复制失败，返回错误403 Forbidden。异常描述为：
     * 
     * ErrorCode: InvalidObjectState
     * 
     * ErrorMessage: Operation is not valid for the source object&#39;s storage class
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyObjectRequest 请求对象
     * @return CompletableFuture<CopyObjectResponse>
     */
    public CompletableFuture<CopyObjectResponse> copyObjectAsync(CopyObjectRequest request) {
        return hcClient.asyncInvokeHttp(request, ObsMeta.copyObject);
    }

    /**
     * 复制对象
     *
     * 复制对象（Copy Object）特性用来为OBS上已经存在的对象创建一个副本。
     * 
     * 当进行复制对象操作时，目标对象默认复制源对象的元数据；用户也可以将目标对象的元数据替换为本次请求中所带的元数据。新建的目标对象不会复制源对象的ACL信息，默认的新建对象的ACL是private，用户可以使用设置ACL的操作接口来重新设定新对象的ACL。
     * 
     * 复制对象操作的请求需要通过头域携带拷贝的原桶和对象信息，不能携带消息实体。
     * 
     * 该操作支持服务端加密功能。
     * 
     * 目标对象大小范围是[0, 5GB]，如果源对象大小超过5GB，只能使用Range拷贝部分对象。
     * 
     * #### 多版本 ####
     * 默认情况下，x-obs-copy-source标识复制源对象的最新版本。如果源对象的最新版本是删除标记，则认为该对象已删除。要复制指定版本的对象，可以在x-obs-copy-source请求消息头中携带versionId参数。
     * 
     * 如果目标对象的桶的多版本状态是开启的，系统为目标对象生成唯一的版本号（此版本号与源对象的版本号不同），并且会在响应报头x-obs-version-id返回该版本号。如果目标对象的桶的多版本状态是暂停的，则目标对象的版本号为null。
     * 
     * 须知：
     * 在桶没有开启多版本的情况下，将源对象object_A复制为目标对象object_B，如果在复制操作之前对象object_B已经存在，复制操作执行之后老对象object_B则会被新复制对象object_B覆盖，复制成功后，只能下载到新的对象object_B，老对象object_B将会被删除。因此在使用copy接口时请确保目标对象不存在或者已无价值，避免因copy导致数据误删除。复制过程中源对象object_A无任何变化。
     * 
     * 复制对象的结果不能仅根据HTTP返回头域中的status_code来判断请求是否成功，头域中status_code返回200时表示服务端已经收到请求，且开始处理复制对象请求。复制是否成功会在响应消息的body中，只有body体中有ETag标签才表示成功，否则表示复制失败。
     * 
     * #### 归档存储对象 ####
     * 如果源对象是归档存储对象，需要判断源对象的取回状态，只有当源对象处于已取回状态时，才能复制成功。源对象未取回或者正在取回时，会复制失败，返回错误403 Forbidden。异常描述为：
     * 
     * ErrorCode: InvalidObjectState
     * 
     * ErrorMessage: Operation is not valid for the source object&#39;s storage class
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyObjectRequest 请求对象
     * @return AsyncInvoker<CopyObjectRequest, CopyObjectResponse>
     */
    public AsyncInvoker<CopyObjectRequest, CopyObjectResponse> copyObjectAsyncInvoker(CopyObjectRequest request) {
        return new AsyncInvoker<>(request, ObsMeta.copyObject, hcClient);
    }

    /**
     * 创建桶
     *
     * 创建桶是指按照用户指定的桶名创建一个新桶的操作。
     * 
     * 说明：
     * 默认情况下，一个用户可以拥有的桶的数量不能超过100个。
     * 用户删除桶后，需要等待30分钟才能创建同名桶和并行文件系统。
     * OBS支持在创建桶时指定桶的AZ类型，您可以开启或关闭多AZ。关闭多AZ时，桶内数据默认存储在单个AZ内；开启多AZ时，桶内数据冗余存储在多个AZ内，可靠性更高。旧桶AZ类型默认为单AZ。
     * 新创建桶的桶名在OBS中必须是唯一的。如果是同一个用户重复创建同一区域的同名桶时返回成功。除此以外的其他场景重复创建同名桶返回桶已存在。用户可以在请求消息头中加入x-obs-acl等参数，设置要创建桶的权限控制策略。
     * 
     * #### 存储类型 ####
     * 允许用户创建不同默认存储类型的桶。发送创桶请求时携带头域“x-obs-storage-class”来指定桶的默认存储类型。桶内对象的存储类型与桶默认存储类型保持一致。存储类型有3种：STANDARD（标准存储）、WARM（低频访问存储）、COLD（归档存储）。如果没有携带此头域 ，则创建的桶为标准存储类型。
     * 
     * 当往桶内上传对象时，如果没有指定对象的存储类别（参考PUT上传），则该对象的存储类型取桶的默认存储类型。
     * 
     * OBS标准存储拥有低访问时延和较高的吞吐量，因而适用于有大量热点文件需要频繁访问数据的业务场景，例如：大数据、移动应用、热点视频、社交图片等场景。
     * OBS低频访问存储适用于不频繁访问（少于每月一次访问）但在需要时也要求快速访问数据的业务场景，例如：文件同步/共享、企业备份等场景。与标准存储相比，低频访问存储有相同的数据持久性、吞吐量以及访问时延，且成本较低，但是可用性略低于标准存储。
     * OBS归档存储适用于很少访问（平均一年访问一次）数据的业务场景，例如：数据归档、长期备份等场景。归档存储安全、持久且成本极低，可以用来替代磁带库。为了保持成本低廉，数据取回时间可能长达数分钟到数小时不等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBucketRequest 请求对象
     * @return CompletableFuture<CreateBucketResponse>
     */
    public CompletableFuture<CreateBucketResponse> createBucketAsync(CreateBucketRequest request) {
        return hcClient.asyncInvokeHttp(request, ObsMeta.createBucket);
    }

    /**
     * 创建桶
     *
     * 创建桶是指按照用户指定的桶名创建一个新桶的操作。
     * 
     * 说明：
     * 默认情况下，一个用户可以拥有的桶的数量不能超过100个。
     * 用户删除桶后，需要等待30分钟才能创建同名桶和并行文件系统。
     * OBS支持在创建桶时指定桶的AZ类型，您可以开启或关闭多AZ。关闭多AZ时，桶内数据默认存储在单个AZ内；开启多AZ时，桶内数据冗余存储在多个AZ内，可靠性更高。旧桶AZ类型默认为单AZ。
     * 新创建桶的桶名在OBS中必须是唯一的。如果是同一个用户重复创建同一区域的同名桶时返回成功。除此以外的其他场景重复创建同名桶返回桶已存在。用户可以在请求消息头中加入x-obs-acl等参数，设置要创建桶的权限控制策略。
     * 
     * #### 存储类型 ####
     * 允许用户创建不同默认存储类型的桶。发送创桶请求时携带头域“x-obs-storage-class”来指定桶的默认存储类型。桶内对象的存储类型与桶默认存储类型保持一致。存储类型有3种：STANDARD（标准存储）、WARM（低频访问存储）、COLD（归档存储）。如果没有携带此头域 ，则创建的桶为标准存储类型。
     * 
     * 当往桶内上传对象时，如果没有指定对象的存储类别（参考PUT上传），则该对象的存储类型取桶的默认存储类型。
     * 
     * OBS标准存储拥有低访问时延和较高的吞吐量，因而适用于有大量热点文件需要频繁访问数据的业务场景，例如：大数据、移动应用、热点视频、社交图片等场景。
     * OBS低频访问存储适用于不频繁访问（少于每月一次访问）但在需要时也要求快速访问数据的业务场景，例如：文件同步/共享、企业备份等场景。与标准存储相比，低频访问存储有相同的数据持久性、吞吐量以及访问时延，且成本较低，但是可用性略低于标准存储。
     * OBS归档存储适用于很少访问（平均一年访问一次）数据的业务场景，例如：数据归档、长期备份等场景。归档存储安全、持久且成本极低，可以用来替代磁带库。为了保持成本低廉，数据取回时间可能长达数分钟到数小时不等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBucketRequest 请求对象
     * @return AsyncInvoker<CreateBucketRequest, CreateBucketResponse>
     */
    public AsyncInvoker<CreateBucketRequest, CreateBucketResponse> createBucketAsyncInvoker(
        CreateBucketRequest request) {
        return new AsyncInvoker<>(request, ObsMeta.createBucket, hcClient);
    }

    /**
     * 删除桶
     *
     * 删除桶操作用于删除用户指定的桶。只有桶的所有者或者拥有桶的删桶policy权限的用户可以执行删除桶的操作，要删除的桶必须是空桶。如果桶中有对象或者有多段任务则认为桶不为空，可以使用列举桶内对象和列举出多段上传任务接口来确认桶是否为空。
     * 注：
     * 如果删除桶时，服务端返回5XX错误或超时，系统需要时间进行桶信息一致性处理，在此期间桶的信息会不准确，过一段时间再查看桶是否删除成功，查询到桶，需要再次发送删除桶消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBucketRequest 请求对象
     * @return CompletableFuture<DeleteBucketResponse>
     */
    public CompletableFuture<DeleteBucketResponse> deleteBucketAsync(DeleteBucketRequest request) {
        return hcClient.asyncInvokeHttp(request, ObsMeta.deleteBucket);
    }

    /**
     * 删除桶
     *
     * 删除桶操作用于删除用户指定的桶。只有桶的所有者或者拥有桶的删桶policy权限的用户可以执行删除桶的操作，要删除的桶必须是空桶。如果桶中有对象或者有多段任务则认为桶不为空，可以使用列举桶内对象和列举出多段上传任务接口来确认桶是否为空。
     * 注：
     * 如果删除桶时，服务端返回5XX错误或超时，系统需要时间进行桶信息一致性处理，在此期间桶的信息会不准确，过一段时间再查看桶是否删除成功，查询到桶，需要再次发送删除桶消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBucketRequest 请求对象
     * @return AsyncInvoker<DeleteBucketRequest, DeleteBucketResponse>
     */
    public AsyncInvoker<DeleteBucketRequest, DeleteBucketResponse> deleteBucketAsyncInvoker(
        DeleteBucketRequest request) {
        return new AsyncInvoker<>(request, ObsMeta.deleteBucket, hcClient);
    }

    /**
     * 删除桶的自定义域名
     *
     * OBS使用DELETE操作来删除指定桶的标签。
     * 
     * 要正确执行此操作，需要确保执行者有PutBucketcustomdomain权限。缺省情况下只有桶的所有者可以执行此操作，也可以通过设置桶策略或用户策略授权给其他用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBucketCustomdomainRequest 请求对象
     * @return CompletableFuture<DeleteBucketCustomdomainResponse>
     */
    public CompletableFuture<DeleteBucketCustomdomainResponse> deleteBucketCustomdomainAsync(
        DeleteBucketCustomdomainRequest request) {
        return hcClient.asyncInvokeHttp(request, ObsMeta.deleteBucketCustomdomain);
    }

    /**
     * 删除桶的自定义域名
     *
     * OBS使用DELETE操作来删除指定桶的标签。
     * 
     * 要正确执行此操作，需要确保执行者有PutBucketcustomdomain权限。缺省情况下只有桶的所有者可以执行此操作，也可以通过设置桶策略或用户策略授权给其他用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBucketCustomdomainRequest 请求对象
     * @return AsyncInvoker<DeleteBucketCustomdomainRequest, DeleteBucketCustomdomainResponse>
     */
    public AsyncInvoker<DeleteBucketCustomdomainRequest, DeleteBucketCustomdomainResponse> deleteBucketCustomdomainAsyncInvoker(
        DeleteBucketCustomdomainRequest request) {
        return new AsyncInvoker<>(request, ObsMeta.deleteBucketCustomdomain, hcClient);
    }

    /**
     * 删除对象
     *
     * 删除对象的操作。如果要删除的对象不存在，则仍然返回成功信息。
     * 
     * #### 多版本 ####
     * 当桶的多版本状态是开启时，不指定版本删除对象将产生一个带唯一版本号的删除标记，并不删除对象；当桶的多版本状态是Suspended时，不指定版本删除将删除版本号为null的对象，并将产生一个版本号为null的删除标记。
     * 
     * 如果要删除指定版本的对象，请求可携带versionId消息参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteObjectRequest 请求对象
     * @return CompletableFuture<DeleteObjectResponse>
     */
    public CompletableFuture<DeleteObjectResponse> deleteObjectAsync(DeleteObjectRequest request) {
        return hcClient.asyncInvokeHttp(request, ObsMeta.deleteObject);
    }

    /**
     * 删除对象
     *
     * 删除对象的操作。如果要删除的对象不存在，则仍然返回成功信息。
     * 
     * #### 多版本 ####
     * 当桶的多版本状态是开启时，不指定版本删除对象将产生一个带唯一版本号的删除标记，并不删除对象；当桶的多版本状态是Suspended时，不指定版本删除将删除版本号为null的对象，并将产生一个版本号为null的删除标记。
     * 
     * 如果要删除指定版本的对象，请求可携带versionId消息参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteObjectRequest 请求对象
     * @return AsyncInvoker<DeleteObjectRequest, DeleteObjectResponse>
     */
    public AsyncInvoker<DeleteObjectRequest, DeleteObjectResponse> deleteObjectAsyncInvoker(
        DeleteObjectRequest request) {
        return new AsyncInvoker<>(request, ObsMeta.deleteObject, hcClient);
    }

    /**
     * 批量删除对象
     *
     * 批量删除对象特性用于将一个桶内的部分对象一次性删除，删除后不可恢复。批量删除对象要求返回结果里包含每个对象的删除结果。OBS的批量删除对象使用同步删除对象的方式，每个对象的删除结果返回给请求用户。
     * 
     * 批量删除对象支持两种响应方式：verbose和quiet。Verbose是指在返回响应时，不管对象是否删除成功都将删除结果包含在XML响应里；quiet是指在返回响应时，只返回删除失败的对象结果，没有返回的认为删除成功。OBS默认使用verbose模式，如果用户在请求消息体中指定quiet模式的话， 使用quiet模式。
     * 
     * 批量删除的请求消息头中必须包含Content-MD5以及Content-Length，用以保证请求的消息体在服务端检测到网络传输如果有错，则可以检测出来。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteObjectsRequest 请求对象
     * @return CompletableFuture<DeleteObjectsResponse>
     */
    public CompletableFuture<DeleteObjectsResponse> deleteObjectsAsync(DeleteObjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, ObsMeta.deleteObjects);
    }

    /**
     * 批量删除对象
     *
     * 批量删除对象特性用于将一个桶内的部分对象一次性删除，删除后不可恢复。批量删除对象要求返回结果里包含每个对象的删除结果。OBS的批量删除对象使用同步删除对象的方式，每个对象的删除结果返回给请求用户。
     * 
     * 批量删除对象支持两种响应方式：verbose和quiet。Verbose是指在返回响应时，不管对象是否删除成功都将删除结果包含在XML响应里；quiet是指在返回响应时，只返回删除失败的对象结果，没有返回的认为删除成功。OBS默认使用verbose模式，如果用户在请求消息体中指定quiet模式的话， 使用quiet模式。
     * 
     * 批量删除的请求消息头中必须包含Content-MD5以及Content-Length，用以保证请求的消息体在服务端检测到网络传输如果有错，则可以检测出来。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteObjectsRequest 请求对象
     * @return AsyncInvoker<DeleteObjectsRequest, DeleteObjectsResponse>
     */
    public AsyncInvoker<DeleteObjectsRequest, DeleteObjectsResponse> deleteObjectsAsyncInvoker(
        DeleteObjectsRequest request) {
        return new AsyncInvoker<>(request, ObsMeta.deleteObjects, hcClient);
    }

    /**
     * 获取桶ACL
     *
     * 用户执行获取桶ACL的操作，返回信息包含指定桶的权限控制列表信息。用户必须拥有对指定桶READ_ACP的权限或FULL_CONTROL权限，才能执行获取桶ACL的操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetBucketAclRequest 请求对象
     * @return CompletableFuture<GetBucketAclResponse>
     */
    public CompletableFuture<GetBucketAclResponse> getBucketAclAsync(GetBucketAclRequest request) {
        return hcClient.asyncInvokeHttp(request, ObsMeta.getBucketAcl);
    }

    /**
     * 获取桶ACL
     *
     * 用户执行获取桶ACL的操作，返回信息包含指定桶的权限控制列表信息。用户必须拥有对指定桶READ_ACP的权限或FULL_CONTROL权限，才能执行获取桶ACL的操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetBucketAclRequest 请求对象
     * @return AsyncInvoker<GetBucketAclRequest, GetBucketAclResponse>
     */
    public AsyncInvoker<GetBucketAclRequest, GetBucketAclResponse> getBucketAclAsyncInvoker(
        GetBucketAclRequest request) {
        return new AsyncInvoker<>(request, ObsMeta.getBucketAcl, hcClient);
    }

    /**
     * 获取桶的自定义域名
     *
     * OBS使用GET操作来获取桶的自定义域名。
     * 
     * 要正确执行此操作，需要确保执行者有GetBucketcustomdomainConfiguration权限。桶拥有者默认具有此权限，并且可以将此权限授予其他人。
     * 
     * 有关权限控制的更多信息请参考《对象存储服务权限配置指南》的[OBS权限控制概述](https://support.huaweicloud.com/perms-cfg-obs/obs_40_0001.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetBucketCustomdomainRequest 请求对象
     * @return CompletableFuture<GetBucketCustomdomainResponse>
     */
    public CompletableFuture<GetBucketCustomdomainResponse> getBucketCustomdomainAsync(
        GetBucketCustomdomainRequest request) {
        return hcClient.asyncInvokeHttp(request, ObsMeta.getBucketCustomdomain);
    }

    /**
     * 获取桶的自定义域名
     *
     * OBS使用GET操作来获取桶的自定义域名。
     * 
     * 要正确执行此操作，需要确保执行者有GetBucketcustomdomainConfiguration权限。桶拥有者默认具有此权限，并且可以将此权限授予其他人。
     * 
     * 有关权限控制的更多信息请参考《对象存储服务权限配置指南》的[OBS权限控制概述](https://support.huaweicloud.com/perms-cfg-obs/obs_40_0001.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetBucketCustomdomainRequest 请求对象
     * @return AsyncInvoker<GetBucketCustomdomainRequest, GetBucketCustomdomainResponse>
     */
    public AsyncInvoker<GetBucketCustomdomainRequest, GetBucketCustomdomainResponse> getBucketCustomdomainAsyncInvoker(
        GetBucketCustomdomainRequest request) {
        return new AsyncInvoker<>(request, ObsMeta.getBucketCustomdomain, hcClient);
    }

    /**
     * 获取桶元数据
     *
     * 对桶拥有读权限的用户可以执行查询桶元数据是否存在的操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetBucketMetadataRequest 请求对象
     * @return CompletableFuture<GetBucketMetadataResponse>
     */
    public CompletableFuture<GetBucketMetadataResponse> getBucketMetadataAsync(GetBucketMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, ObsMeta.getBucketMetadata);
    }

    /**
     * 获取桶元数据
     *
     * 对桶拥有读权限的用户可以执行查询桶元数据是否存在的操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetBucketMetadataRequest 请求对象
     * @return AsyncInvoker<GetBucketMetadataRequest, GetBucketMetadataResponse>
     */
    public AsyncInvoker<GetBucketMetadataRequest, GetBucketMetadataResponse> getBucketMetadataAsyncInvoker(
        GetBucketMetadataRequest request) {
        return new AsyncInvoker<>(request, ObsMeta.getBucketMetadata, hcClient);
    }

    /**
     * 获取桶的消息通知配置
     *
     * 获取指定桶的消息通知配置信息。
     * 
     * 为了能成功执行此配置操作，需要确保执行者拥有GetBucketNotification权限。默认情况下只有桶的所有者拥有该权限，但可以通过设置桶策略或用户策略授权给其他用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetBucketNotificationRequest 请求对象
     * @return CompletableFuture<GetBucketNotificationResponse>
     */
    public CompletableFuture<GetBucketNotificationResponse> getBucketNotificationAsync(
        GetBucketNotificationRequest request) {
        return hcClient.asyncInvokeHttp(request, ObsMeta.getBucketNotification);
    }

    /**
     * 获取桶的消息通知配置
     *
     * 获取指定桶的消息通知配置信息。
     * 
     * 为了能成功执行此配置操作，需要确保执行者拥有GetBucketNotification权限。默认情况下只有桶的所有者拥有该权限，但可以通过设置桶策略或用户策略授权给其他用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetBucketNotificationRequest 请求对象
     * @return AsyncInvoker<GetBucketNotificationRequest, GetBucketNotificationResponse>
     */
    public AsyncInvoker<GetBucketNotificationRequest, GetBucketNotificationResponse> getBucketNotificationAsyncInvoker(
        GetBucketNotificationRequest request) {
        return new AsyncInvoker<>(request, ObsMeta.getBucketNotification, hcClient);
    }

    /**
     * 获取对象内容
     *
     * GET操作从对象存储下载对象。使用GET接口前，请确认必须拥有对象的READ权限。如果对象Owner向匿名用户授予READ访问权限，则可以在不使用鉴权头域的情况下访问该对象。
     * 
     * #### 服务端加密 ####
     * 如果客户端的对象上传时，使用了客户提供的加密密钥进行服务端加密，当下载对象时，同样也必须在消息中提供密钥。
     * 
     * #### 多版本 ####
     * 默认情况下，获取的是最新版本的对象。如果最新版本的对象是删除标记，则返回对象不存在。如果要获取指定版本的对象，请求可携带versionId消息参数。
     * 
     * #### 归档存储对象 ####
     * 如果要下载的对象是归档存储类对象，由于对象存储在存档设备中，您必须先使用对象取回，然后才能下载该归档存储对象。对象处于不同的取回状态时，给出不同响应：如果对象已取回，下载对象成功时需要返回x-obs-restore头域指示取回失效时间。对未取回或正在取回的归档存储对象发送下载请求时，会返回错误403 Forbidden。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetObjectRequest 请求对象
     * @return CompletableFuture<GetObjectResponse>
     */
    public CompletableFuture<GetObjectResponse> getObjectAsync(GetObjectRequest request) {
        return hcClient.asyncInvokeHttp(request, ObsMeta.getObject);
    }

    /**
     * 获取对象内容
     *
     * GET操作从对象存储下载对象。使用GET接口前，请确认必须拥有对象的READ权限。如果对象Owner向匿名用户授予READ访问权限，则可以在不使用鉴权头域的情况下访问该对象。
     * 
     * #### 服务端加密 ####
     * 如果客户端的对象上传时，使用了客户提供的加密密钥进行服务端加密，当下载对象时，同样也必须在消息中提供密钥。
     * 
     * #### 多版本 ####
     * 默认情况下，获取的是最新版本的对象。如果最新版本的对象是删除标记，则返回对象不存在。如果要获取指定版本的对象，请求可携带versionId消息参数。
     * 
     * #### 归档存储对象 ####
     * 如果要下载的对象是归档存储类对象，由于对象存储在存档设备中，您必须先使用对象取回，然后才能下载该归档存储对象。对象处于不同的取回状态时，给出不同响应：如果对象已取回，下载对象成功时需要返回x-obs-restore头域指示取回失效时间。对未取回或正在取回的归档存储对象发送下载请求时，会返回错误403 Forbidden。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetObjectRequest 请求对象
     * @return AsyncInvoker<GetObjectRequest, GetObjectResponse>
     */
    public AsyncInvoker<GetObjectRequest, GetObjectResponse> getObjectAsyncInvoker(GetObjectRequest request) {
        return new AsyncInvoker<>(request, ObsMeta.getObject, hcClient);
    }

    /**
     * 获取对象元数据
     *
     * 拥有对象读权限的用户可以执行HEAD操作命令获取对象元数据，返回信息包含对象的元数据信息。
     * 该操作支持服务端加密功能。
     * 
     * #### 多版本 ####
     * 默认情况下，获取的是最新版本的对象元数据。如果最新版本的对象是删除标记，则返回404。如果要获取指定版本的对象元数据，请求可携带versionId消息参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetObjectMetadataRequest 请求对象
     * @return CompletableFuture<GetObjectMetadataResponse>
     */
    public CompletableFuture<GetObjectMetadataResponse> getObjectMetadataAsync(GetObjectMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, ObsMeta.getObjectMetadata);
    }

    /**
     * 获取对象元数据
     *
     * 拥有对象读权限的用户可以执行HEAD操作命令获取对象元数据，返回信息包含对象的元数据信息。
     * 该操作支持服务端加密功能。
     * 
     * #### 多版本 ####
     * 默认情况下，获取的是最新版本的对象元数据。如果最新版本的对象是删除标记，则返回404。如果要获取指定版本的对象元数据，请求可携带versionId消息参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetObjectMetadataRequest 请求对象
     * @return AsyncInvoker<GetObjectMetadataRequest, GetObjectMetadataResponse>
     */
    public AsyncInvoker<GetObjectMetadataRequest, GetObjectMetadataResponse> getObjectMetadataAsyncInvoker(
        GetObjectMetadataRequest request) {
        return new AsyncInvoker<>(request, ObsMeta.getObjectMetadata, hcClient);
    }

    /**
     * 获取桶列表
     *
     * OBS用户可以通过请求查询自己创建的桶列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBucketsRequest 请求对象
     * @return CompletableFuture<ListBucketsResponse>
     */
    public CompletableFuture<ListBucketsResponse> listBucketsAsync(ListBucketsRequest request) {
        return hcClient.asyncInvokeHttp(request, ObsMeta.listBuckets);
    }

    /**
     * 获取桶列表
     *
     * OBS用户可以通过请求查询自己创建的桶列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBucketsRequest 请求对象
     * @return AsyncInvoker<ListBucketsRequest, ListBucketsResponse>
     */
    public AsyncInvoker<ListBucketsRequest, ListBucketsResponse> listBucketsAsyncInvoker(ListBucketsRequest request) {
        return new AsyncInvoker<>(request, ObsMeta.listBuckets, hcClient);
    }

    /**
     * 列举桶内对象
     *
     * 对桶拥有读权限的用户可以执行获取桶内对象列表的操作。
     * 
     * 如果用户在请求的URI里只指定了桶名，即GET /BucketName，则返回信息中会包含桶内部分或所有对象的描述信息（一次最多返回1000个对象信息）；如果用户还指定了prefix、marker、max-keys、delimiter参数中的一个或多个，则返回的对象列表将按照如表1所示规定的语义返回指定的对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObjectsRequest 请求对象
     * @return CompletableFuture<ListObjectsResponse>
     */
    public CompletableFuture<ListObjectsResponse> listObjectsAsync(ListObjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, ObsMeta.listObjects);
    }

    /**
     * 列举桶内对象
     *
     * 对桶拥有读权限的用户可以执行获取桶内对象列表的操作。
     * 
     * 如果用户在请求的URI里只指定了桶名，即GET /BucketName，则返回信息中会包含桶内部分或所有对象的描述信息（一次最多返回1000个对象信息）；如果用户还指定了prefix、marker、max-keys、delimiter参数中的一个或多个，则返回的对象列表将按照如表1所示规定的语义返回指定的对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObjectsRequest 请求对象
     * @return AsyncInvoker<ListObjectsRequest, ListObjectsResponse>
     */
    public AsyncInvoker<ListObjectsRequest, ListObjectsResponse> listObjectsAsyncInvoker(ListObjectsRequest request) {
        return new AsyncInvoker<>(request, ObsMeta.listObjects, hcClient);
    }

    /**
     * PUT上传对象
     *
     * 用户在OBS系统中创建了桶之后，可以采用PUT操作的方式将对象上传到桶中。上传对象操作是指在指定的桶内增加一个对象，执行该操作需要用户拥有桶的写权限。
     * 说明： 同一个桶中存储的对象名是唯一的。
     * 在桶未开启多版本的情况下，如果在指定的桶内已经有相同的对象键值的对象，用户上传的新对象会覆盖原来的对象；为了确保数据在传输过程中没有遭到破坏，用户可以在请求消息头中加入Content-MD5参数。在这种情况下，OBS收到上传的对象后，会对对象进行MD5校验，如果不一致则返回出错信息。
     * 用户还可以在上传对象时指定x-obs-acl参数，设置对象的权限控制策略。如果匿名用户在上传对象时未指定x-obs-acl参数，则该对象默认可以被所有OBS用户访问。
     * 该操作支持服务端加密功能。
     * 单次上传对象大小范围是[0, 5GB]，如果需要上传超过5GB的大文件，需要通过多段操作来分段上传。
     * OBS没有文件夹的概念。为了使用户更方便进行管理数据，OBS提供了一种方式模拟文件夹：通过在对象的名称中增加“/”，例如“test/123.jpg”。此时，“test”就被模拟成了一个文件夹，“123.jpg”则模拟成“test”文件夹下的文件名了，而实际上，对象名称（Key）仍然是“test/123.jpg”。此类命名方式的对象，在控制台上会以文件夹的形式展示。
     * #### 与POST上传的区别 #### PUT上传中参数通过请求头域传递；POST上传则作为消息体中的表单域传递。
     * PUT上传需在URL中指定对象名；POST上传提交的URL为桶域名，无需指定对象名。两者的请求行分别为：
     * PUT /ObjectName HTTP/1.1
     * POST / HTTP/1.1
     * 关于POST上传的更多详细信息，请参考POST上传。
     * #### 多版本 #### 如果桶的多版本状态是开启的，系统会自动为对象生成一个唯一的版本号，并且会在响应报头x-obs-version-id返回该版本号。如果桶的多版本状态是暂停的，则对象的版本号为null。关于桶的多版本状态，参见设置桶的多版本状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutObjectRequest 请求对象
     * @return CompletableFuture<PutObjectResponse>
     */
    public CompletableFuture<PutObjectResponse> putObjectAsync(PutObjectRequest request) {
        return hcClient.asyncInvokeHttp(request, ObsMeta.putObject);
    }

    /**
     * PUT上传对象
     *
     * 用户在OBS系统中创建了桶之后，可以采用PUT操作的方式将对象上传到桶中。上传对象操作是指在指定的桶内增加一个对象，执行该操作需要用户拥有桶的写权限。
     * 说明： 同一个桶中存储的对象名是唯一的。
     * 在桶未开启多版本的情况下，如果在指定的桶内已经有相同的对象键值的对象，用户上传的新对象会覆盖原来的对象；为了确保数据在传输过程中没有遭到破坏，用户可以在请求消息头中加入Content-MD5参数。在这种情况下，OBS收到上传的对象后，会对对象进行MD5校验，如果不一致则返回出错信息。
     * 用户还可以在上传对象时指定x-obs-acl参数，设置对象的权限控制策略。如果匿名用户在上传对象时未指定x-obs-acl参数，则该对象默认可以被所有OBS用户访问。
     * 该操作支持服务端加密功能。
     * 单次上传对象大小范围是[0, 5GB]，如果需要上传超过5GB的大文件，需要通过多段操作来分段上传。
     * OBS没有文件夹的概念。为了使用户更方便进行管理数据，OBS提供了一种方式模拟文件夹：通过在对象的名称中增加“/”，例如“test/123.jpg”。此时，“test”就被模拟成了一个文件夹，“123.jpg”则模拟成“test”文件夹下的文件名了，而实际上，对象名称（Key）仍然是“test/123.jpg”。此类命名方式的对象，在控制台上会以文件夹的形式展示。
     * #### 与POST上传的区别 #### PUT上传中参数通过请求头域传递；POST上传则作为消息体中的表单域传递。
     * PUT上传需在URL中指定对象名；POST上传提交的URL为桶域名，无需指定对象名。两者的请求行分别为：
     * PUT /ObjectName HTTP/1.1
     * POST / HTTP/1.1
     * 关于POST上传的更多详细信息，请参考POST上传。
     * #### 多版本 #### 如果桶的多版本状态是开启的，系统会自动为对象生成一个唯一的版本号，并且会在响应报头x-obs-version-id返回该版本号。如果桶的多版本状态是暂停的，则对象的版本号为null。关于桶的多版本状态，参见设置桶的多版本状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutObjectRequest 请求对象
     * @return AsyncInvoker<PutObjectRequest, PutObjectResponse>
     */
    public AsyncInvoker<PutObjectRequest, PutObjectResponse> putObjectAsyncInvoker(PutObjectRequest request) {
        return new AsyncInvoker<>(request, ObsMeta.putObject, hcClient);
    }

    /**
     * 设置桶ACL
     *
     * OBS支持对桶操作进行权限控制。默认情况下，只有桶的创建者才有该桶的读写权限。用户也可以设置其他的访问策略，比如对一个桶可以设置公共访问策略，允许所有人对其都有读权限。
     * 
     * OBS用户在创建桶时可以设置权限控制策略，也可以通过ACL操作API接口对已存在的桶更改或者获取ACL(access control list) 。一个桶的ACL最多支持100条Grant授权。PUT接口为幂等的覆盖写语意，新设置的桶ACL将覆盖原有的桶ACL，如果需要修改或者删除某条ACL重新PUT一个新的桶ACL即可。
     * 
     * 使用桶ACL进行权限控制请参考[《对象存储服务权限配置指南》的OBS权限控制概述章节](https://support.huaweicloud.com/perms-cfg-obs/obs_40_0001.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBucketAclRequest 请求对象
     * @return CompletableFuture<SetBucketAclResponse>
     */
    public CompletableFuture<SetBucketAclResponse> setBucketAclAsync(SetBucketAclRequest request) {
        return hcClient.asyncInvokeHttp(request, ObsMeta.setBucketAcl);
    }

    /**
     * 设置桶ACL
     *
     * OBS支持对桶操作进行权限控制。默认情况下，只有桶的创建者才有该桶的读写权限。用户也可以设置其他的访问策略，比如对一个桶可以设置公共访问策略，允许所有人对其都有读权限。
     * 
     * OBS用户在创建桶时可以设置权限控制策略，也可以通过ACL操作API接口对已存在的桶更改或者获取ACL(access control list) 。一个桶的ACL最多支持100条Grant授权。PUT接口为幂等的覆盖写语意，新设置的桶ACL将覆盖原有的桶ACL，如果需要修改或者删除某条ACL重新PUT一个新的桶ACL即可。
     * 
     * 使用桶ACL进行权限控制请参考[《对象存储服务权限配置指南》的OBS权限控制概述章节](https://support.huaweicloud.com/perms-cfg-obs/obs_40_0001.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBucketAclRequest 请求对象
     * @return AsyncInvoker<SetBucketAclRequest, SetBucketAclResponse>
     */
    public AsyncInvoker<SetBucketAclRequest, SetBucketAclResponse> setBucketAclAsyncInvoker(
        SetBucketAclRequest request) {
        return new AsyncInvoker<>(request, ObsMeta.setBucketAcl, hcClient);
    }

    /**
     * 设置桶的自定义域名
     *
     * OBS使用PUT操作为桶设置自定义域名，设置成功之后，用户访问桶的自定义域名就能访问到桶。
     * 
     * 必须保证此自定义域名通过DNS能够正确解析到OBS服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBucketCustomedomainRequest 请求对象
     * @return CompletableFuture<SetBucketCustomedomainResponse>
     */
    public CompletableFuture<SetBucketCustomedomainResponse> setBucketCustomedomainAsync(
        SetBucketCustomedomainRequest request) {
        return hcClient.asyncInvokeHttp(request, ObsMeta.setBucketCustomedomain);
    }

    /**
     * 设置桶的自定义域名
     *
     * OBS使用PUT操作为桶设置自定义域名，设置成功之后，用户访问桶的自定义域名就能访问到桶。
     * 
     * 必须保证此自定义域名通过DNS能够正确解析到OBS服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBucketCustomedomainRequest 请求对象
     * @return AsyncInvoker<SetBucketCustomedomainRequest, SetBucketCustomedomainResponse>
     */
    public AsyncInvoker<SetBucketCustomedomainRequest, SetBucketCustomedomainResponse> setBucketCustomedomainAsyncInvoker(
        SetBucketCustomedomainRequest request) {
        return new AsyncInvoker<>(request, ObsMeta.setBucketCustomedomain, hcClient);
    }

    /**
     * 设置桶的消息通知配置
     *
     * OBS消息通知功能能够帮助您对桶的重要的操作及时通知到您，确保您安全、及时知道发生在桶上的关键事件。
     * 
     * 默认情况下，您的桶没有配置事件通知。这个时候桶的通知配置将是一个空NotificationConfiguration。对已配置有事件通知的桶，可以通过添加空NotificationConfiguration元素禁用消息通知功能。
     * 
     * &lt;NotificationConfiguration&gt;
     * &lt;/NotificationConfiguration&gt; 
     * 
     * 目前对象存储服务（OBS）支持包括简单通知服务（SMN）、函数工作流服务（FunctionGraph）在内的两种桶通知服务配置。以SMN为例，当OBS接收到配置消息通知的请求后，会验证指定的消息通知服务（SMN）主题是否存在及主题策略是否授权给了对象存储服务，验证通过后会向该主题订阅者发送一个测试消息通知。
     * 
     * 为了能成功执行此配置操作，需要确保执行者拥有PutBucketNotification权限。默认情况下只有桶的所有者拥有该权限，但可以通过设置桶策略授权给其他用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBucketNotificationRequest 请求对象
     * @return CompletableFuture<SetBucketNotificationResponse>
     */
    public CompletableFuture<SetBucketNotificationResponse> setBucketNotificationAsync(
        SetBucketNotificationRequest request) {
        return hcClient.asyncInvokeHttp(request, ObsMeta.setBucketNotification);
    }

    /**
     * 设置桶的消息通知配置
     *
     * OBS消息通知功能能够帮助您对桶的重要的操作及时通知到您，确保您安全、及时知道发生在桶上的关键事件。
     * 
     * 默认情况下，您的桶没有配置事件通知。这个时候桶的通知配置将是一个空NotificationConfiguration。对已配置有事件通知的桶，可以通过添加空NotificationConfiguration元素禁用消息通知功能。
     * 
     * &lt;NotificationConfiguration&gt;
     * &lt;/NotificationConfiguration&gt; 
     * 
     * 目前对象存储服务（OBS）支持包括简单通知服务（SMN）、函数工作流服务（FunctionGraph）在内的两种桶通知服务配置。以SMN为例，当OBS接收到配置消息通知的请求后，会验证指定的消息通知服务（SMN）主题是否存在及主题策略是否授权给了对象存储服务，验证通过后会向该主题订阅者发送一个测试消息通知。
     * 
     * 为了能成功执行此配置操作，需要确保执行者拥有PutBucketNotification权限。默认情况下只有桶的所有者拥有该权限，但可以通过设置桶策略授权给其他用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBucketNotificationRequest 请求对象
     * @return AsyncInvoker<SetBucketNotificationRequest, SetBucketNotificationResponse>
     */
    public AsyncInvoker<SetBucketNotificationRequest, SetBucketNotificationResponse> setBucketNotificationAsyncInvoker(
        SetBucketNotificationRequest request) {
        return new AsyncInvoker<>(request, ObsMeta.setBucketNotification, hcClient);
    }

}
