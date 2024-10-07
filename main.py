import os
import psycopg2
from dotenv import load_dotenv

load_dotenv()

DB_HOST= os.getenv('DB_HOST')
DB_USER =os.getenv('DB_USER')
DB_PASSWORD = os.getenv('DB_PASSWORD')
DB_NAME=dbDelfis = os.getenv('DB_PASSWORD')

def conectar_banco_de_dados():
 
    connection = psycopg2.connect(
        host= DB_HOST,
        user= DB_USER,
        password=DB_PASSWORD,
        dbname=DB_NAME
    )
    return connection
