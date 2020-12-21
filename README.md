
镜像的重要性无需要多言，微服务、容器化、DevOps 这些技术最终都会以镜像作为载体而体现。此次活动寓教于乐，希望大家分享下相关的调优技巧。活动后将在本公众号（JAVA 架构笔记）分享相关的优化过程。


## 题目

[https://github.com/pig-mesh/demo-server](https://github.com/pig-mesh/demo-server "基础工程")

**基础工程已提供，请使用此项目构建 jar (17M)**

基础工程基于 Spring Boot 2.4.1 构建，只包含最基础的 web 依赖。

---

- 确保工程能够正确运行, 访问根路径输出基本文案

![](https://minio.pigx.vip/oss/1608544567.png)

- 不得对基础工程 maven 依赖进行排除操作

- 不得使用 native-image。(spring boot 对 native-image 支持并不完善)

- 除以上外再无其他约束

## 镜像提交

截止时间 2020-12-25， 奖励在 12.26 周六发出。

- 镜像提交 DockerHub [提交操作步骤](https://juejin.cn/post/6867314548399931399 "提交步骤")

- 参与者将镜像、作者相关信息发送到邮箱 `pig4cloud@qq.com` , 有任何问题可加我（冷冷）微信: `springboot0`

## 活动奖励

最小的那位将获得 RMB 666

![](https://imgkr2.cn-bj.ufileos.com/25a63684-70a2-4195-9013-f29ef428c410.png?UCloudPublicKey=TOKEN_8d8b72be-579a-4e83-bfd0-5f6ce1546f13&Signature=XW%252BDVlD6A2Ri7ztR9ReNpVyRlrY%253D&Expires=1608631872)
