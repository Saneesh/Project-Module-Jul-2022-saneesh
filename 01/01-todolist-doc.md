# Todo List Backend Service 

## API Docs 

# Todo List Backend Service

## API Docs

**POST** `/tasks`
> Add task
####Request
```json
{
  "title": "Test",
  "due_date": "10/12/2022",
  "completed": false
}
```
####Response
```json
{
  "id": 1,
  "title": "Test",
  "due_date": "10/12/2022",
  "completed": false,
  "code": 201,
  "message": "Task created successfully"
}
```

**PATCH** `/tasks/{id}`
> Edit task
####Request
```json
{
  "id": 1,
  "title": "Test",
  "due_date": "10/12/2022",
  "completed": false
}
```
####Response
```json
{
  "id": 1,
  "title": "Test",
  "due_date": "10/12/2022",
  "completed": false,
  "code": 204,
  "message": "Task edited successfully"
}
```

**DELETE** `/tasks/{id}`
> Delete task
####Response
```json
{
  "code": 204,
  "message": "Task deleted successfully"
}
```

**GET** `/tasks/` 📄
> List tasks with/without notes
####Request
```json
{
  "notes": true
}
```
####Response
```json
[
  {
    "id": 1,
    "title": "Test",
    "due_date": "10/12/2022",
    "completed": false,
    "notes": [
      {
        "id": 1,
        "title": "Test",
        "body": "This is the body"
      }
    ]
  }
]
```

**GET** `/tasks/{id}`
> List task by id
####Response
```json
{
  "id": 1,
  "title": "Test",
  "due_date": "10/12/2022",
  "completed": false
}
```

**POST** `/tasks/{id}/notes`
> Add note to a task
####Request
```json
{
  "task_id": 1,
  "title": "Test",
  "body": "This is the body"
}
```
####Response
```json
{
  "id": 1,
  "title": "Test",
  "body": "This is the body",
  "code": 201,
  "message": "Task created successfully"
}
```


**PATCH** `/tasks/{task_id}/notes/{id}`
> Edit note of a task
####Request
```json
{
  "id": 1,
  "task_id": 1,
  "title": "Test",
  "body": "This is the body"
}
```
####Response
```json
{
  "id": 1,
  "task_id": 1,
  "title": "Test",
  "body": "This is the body",
  "code": 204,
  "message": "Task created successfully"
}
```

**DELETE** `/tasks/{task_id}/notes/{id}`
> Delete note of a task
####Response
```json
{
  "code": 204,
  "message": "Note deleted successfully"
}
```


### References

If 📄 is used, it means the endpoint supports `?size=10&page=2` type of pagination properties

## Entities

![image](https://user-images.githubusercontent.com/1327050/180837289-72d49220-f104-45dd-80c6-e30378ab62a6.png)


### References 

If 📄 is used, it means the endpoint supports `?size=10&page=2` type of pagination properties 

## Entities 

![image](https://user-images.githubusercontent.com/1327050/180837289-72d49220-f104-45dd-80c6-e30378ab62a6.png)

