# Bloggin App Backend Service

## API Docs

**POST** `/users`
> Create user
#### Request
```json
{
  "name": "Test",
  "email": "tester@test.com",
  "password": false,
  "bio": "Hello",
  "avatar": "avatar path"
}
```
#### Response
```json
{
  "data": {
    "id": 1,
    "name": "Test",
    "email": "tester@test.com",
    "password": false,
    "bio": "Hello",
    "avatar": "avatar path",
    "code": 201,
    "message": "Task created successfully"
  }
}
```

**POST** `/login`
> Login user
#### Request
```json
{
  "email": "tester@test.com",
  "password": "LetMeGetIn"
}
```
#### Response
```json
{
  "data": {
    "name": "Test",
    "email": "tester@test.com",
    "avatar": "avatar path",
    "token": "<token>",
    "code": 200
  }
}
```

**POST** `/articles`
> Create article by a user
#### Request
```json
{
  "user_id": "1",
  "title": "This is the title",
  "sub_title": "Here is the subtitle",
  "body": "This is the body",
  "tags": "tag1, tag2"
}
```
#### Response
```json
{
  "data": {
    "id": "1",
    "user_id": "1",
    "title": "This is the title",
    "sub_title": "Here is the subtitle",
    "body": "This is the body",
    "tags": "tag1, tag2",
    "code": 201,
    "message": "Article created successfully"
  }
}
```


**GET** `/articles` 📄
> List articles with filter and pagination
#### Response
```json
{
  "data": [{
    "id": "1",
    "user_id": "1",
    "title": "This is the title",
    "sub_title": "Here is the subtitle",
    "body": "This is the body",
    "tags": "tag1, tag2"
  }],
  "meta": {
      "page": {
        "first": 1,
        "last": 100,
        "prev": null,
        "next": 2
      }
  }
}
```

**PATCH** `/articles/{id}`
> Edit article by the author
#### Request
```json
{
  "user_id": "1",
  "title": "This is the title",
  "sub_title": "Here is the subtitle",
  "body": "This is the body",
  "tags": "tag1, tag2"
}
```
#### Response
```json
{
  "data": {
    "id": "1",
    "user_id": "1",
    "title": "This is the title",
    "sub_title": "Here is the subtitle",
    "body": "This is the body",
    "tags": "tag1, tag2",
    "code": 200,
    "message": "Article edited successfully"
  }
}
```

**DELETE** `/articles/{user_id}/{id}` 
> Delete article by the author
#### Response
```json
{
  "data": {
    "id": "1",
    "user_id": "1",
    "code": 200,
    "message": "Article deleted successfully"
  }
}
```

**POST** `/comments`
> Add comment to an article by users
#### Request
```json
{
  "user_id": "1",
  "article_id": 1,
  "comment": "This is the comment"
}
```
#### Response
```json
{
  "data": {
    "id": "1",
    "article_id": 1,
    "comment": "This is the comment"
    "code": 201,
    "message": "Comment created successfully"
  }
}
```

**DELETE** `/comments`
> Delete comment by the author
#### Request
```json
{
  "id": "1",
  "article_id": 1
}
```
#### Response
```json
{
  "data": {
    "id": "1",
    "article_id": "1",
    "code": 200,
    "message": "Article deleted successfully"
  }
}
```

**POST** `/likes`
> Like an article by users
#### Request
```json
{
  "user_id": "1",
  "article_id": 1
}
```
#### Response
```json
{
  "id": "1",
  "user_id": "1",
  "article_id": 1,
  "is_like": true,
  "code": 200,
  "message": "Liked/Unliked successfully"
}
```

**POST** `/articles?filter=user`
> List the users who liked the article
#### Request
```json
{
  "user_id": "1",
  "article_id": 1
}
```
#### Response
```json
{
  "data": [{
    "user_id": "1",

  }]
}
```

**POST** `/articles?filter=comment&article_id={id}`
> List the comments of an article
#### Request
```json
{
  "user_id": "1",
  "article_id": 1
}
```
#### Response
```json
{
  "data": [{
    "comment_id": "1",
    "comment" : "This is the comment"
  }]
}
```



### References

If 📄 is used, it means the endpoint supports `?size=10&page=2` type of pagination properties

## Entities

![image](https://user-images.githubusercontent.com/1501763/181026692-dca11ea4-a7ef-4b61-94f9-0a4a50a90f4c.png)
