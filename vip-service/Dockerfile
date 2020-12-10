FROM python
COPY main.py /app/main.py
COPY requirements.txt /app/requirements.txt

WORKDIR /app/

RUN pip install -r requirements.txt

ENV FLASK_APP=/app/main.py

CMD ["flask", "run", "--host=0.0.0.0"]
