def cifrar_caracter(caracter, clave):
    if 'A' <= caracter <= 'Z':
        nueva_posicion = (ord(caracter) - ord('A') + clave) % 26 + ord('A')
        return chr(nueva_posicion)
    elif 'a' <= caracter <= 'z':
        nueva_posicion = (ord(caracter) - ord('a') + clave) % 26 + ord('a')
        return chr(nueva_posicion)
    else:
        return caracter

mensaje_original = input()
clave = int(input())

mensaje_cifrado = ''.join(cifrar_caracter(caracter, clave) for caracter in mensaje_original)

print(mensaje_cifrado)
